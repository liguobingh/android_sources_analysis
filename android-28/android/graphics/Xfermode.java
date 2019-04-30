/*
 * Copyright (C) 2006 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

// This file was generated from the C++ include file: SkXfermode.h
// Any changes made to this file will be discarded by the build.
// To change this file, either edit the include, or device/tools/gluemaker/main.cpp, 
// or one of the auxilary file specifications in device/tools/gluemaker.

// 此文件是由 C++ include文件：SkXfermode.h生成过来的，对该文件所做的任何更改都将被构建程序丢弃。
// 要更改此文件，请编辑include文件，或者编辑device/tools/gluemaker/main.cpp文件，或者编辑device/tools/gluemaker中的辅助文件规范之一。

package android.graphics;

/**
 * Xfermode is the base class for objects that are called to implement custom
 * "transfer-modes" in the drawing pipeline. The static function Create(Modes)
 * can be called to return an instance of any of the predefined subclasses as
 * specified in the Modes enum. When an Xfermode is assigned to an Paint, then
 * objects drawn with that paint have the xfermode applied.

 * Xfermode是Object的基类，Object类被调用来实现在绘图管道中的自定义“传输模式”。
 * Xfermode是被调用以在绘图管道中实现自定义“传输模式”的对象的基类。
 * The static function Create(Modes) can be called to return an instance of any of the predefined subclasses as specified in the Modes enum. 
 * When an Xfermode is assigned to an Paint, then objects drawn with that paint have the xfermode applied.
 */
public class Xfermode {
    static final int DEFAULT = PorterDuff.Mode.SRC_OVER.nativeInt;
    int porterDuffMode = DEFAULT;
}
