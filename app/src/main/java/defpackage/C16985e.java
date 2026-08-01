package defpackage;

import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.Window;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٗۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16985e extends C13572e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Rect f33292e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C11252e f33293e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C16985e(android.content.Context r15) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16985e.<init>(android.content.Context):void");
    }

    public final void ads(int i, DialogInterface.OnClickListener onClickListener) {
        C11486e c11486e = (C11486e) this.f26878e;
        c11486e.startapp = c11486e.ad.getText(i);
        c11486e.adcel = onClickListener;
    }

    @Override // defpackage.C13572e
    public final DialogInterfaceC15370e amazon() {
        DialogInterfaceC15370e amazon = super.amazon();
        Window window = amazon.getWindow();
        View decorView = window.getDecorView();
        C11252e c11252e = this.f33293e;
        if (c11252e != null) {
            WeakHashMap weakHashMap = AbstractC2016e.ad;
            c11252e.mopub(decorView.getElevation());
        }
        Rect rect = this.f33292e;
        window.setBackgroundDrawable(new InsetDrawable((Drawable) c11252e, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new ViewOnTouchListenerC7257e(amazon, rect));
        return amazon;
    }

    public final void premium(int i, DialogInterface.OnClickListener onClickListener) {
        C11486e c11486e = (C11486e) this.f26878e;
        c11486e.billing = c11486e.ad.getText(i);
        c11486e.yandex = onClickListener;
    }
}
