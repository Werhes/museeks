package com.google.mlkit.vision.barcode.bundled.internal;

import android.content.Context;
import com.google.android.gms.common.util.DynamiteApi;
import defpackage.AbstractBinderC5545e;
import defpackage.BinderC3838e;
import defpackage.BinderC5086e;
import defpackage.C15573e;
import defpackage.InterfaceC11208e;
import defpackage.InterfaceC15751e;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@DynamiteApi
/* loaded from: classes3.dex */
public class ThickBarcodeScannerCreator extends AbstractBinderC5545e {
    public ThickBarcodeScannerCreator() {
        super("com.google.mlkit.vision.barcode.aidls.IBarcodeScannerCreator");
    }

    @Override // defpackage.InterfaceC11764e
    public InterfaceC11208e newBarcodeScanner(InterfaceC15751e interfaceC15751e, C15573e c15573e) {
        return new BinderC5086e((Context) BinderC3838e.m1403e(interfaceC15751e), c15573e);
    }
}
