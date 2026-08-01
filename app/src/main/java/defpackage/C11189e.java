package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11189e extends InputConnectionWrapper {
    public final /* synthetic */ InterfaceC4583e ad;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11189e(InputConnection inputConnection, InterfaceC4583e interfaceC4583e) {
        super(inputConnection, false);
        this.ad = interfaceC4583e;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        C6594e c6594e = null;
        if (inputContentInfo != null && Build.VERSION.SDK_INT >= 25) {
            c6594e = new C6594e(15, new C12470e(inputContentInfo));
        }
        if (this.ad.yandex(c6594e, i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
