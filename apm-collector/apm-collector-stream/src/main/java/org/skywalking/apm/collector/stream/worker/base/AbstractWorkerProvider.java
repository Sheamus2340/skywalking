/*
 * Copyright 2017, OpenSkywalking Organization All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Project repository: https://github.com/OpenSkywalking/skywalking
 */

package org.skywalking.apm.collector.stream.worker.base;

import org.skywalking.apm.collector.core.module.ModuleManager;

/**
 * Worker 供应者抽象类
 *
 * @author peng-yongsheng
 */
public abstract class AbstractWorkerProvider<INPUT, OUTPUT, WORKER_TYPE extends AbstractWorker<INPUT, OUTPUT>> implements Provider {

    private final ModuleManager moduleManager;

    public AbstractWorkerProvider(ModuleManager moduleManager) {
        this.moduleManager = moduleManager;
    }

    public final ModuleManager getModuleManager() {
        return moduleManager;
    }

    /**
     * 创建 Worker
     *
     * @param moduleManager 组件管理器
     * @return Worker 对象
     */
    public abstract WORKER_TYPE workerInstance(ModuleManager moduleManager);
}
