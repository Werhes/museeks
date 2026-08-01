package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۥُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6777e implements InterfaceC12179e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C5363e f13977e = new C5363e(new C13564e(16));

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AbstractActivityC15824e f13978e;

    public C6777e(AbstractActivityC15824e abstractActivityC15824e) {
        this.f13978e = abstractActivityC15824e;
    }

    @Override // defpackage.InterfaceC12179e
    public final void Signature(InterfaceC16400e interfaceC16400e, EnumC14621e enumC14621e) {
        InputMethodManager inputMethodManager;
        AbstractC16640e abstractC16640e;
        Object vip;
        if (enumC14621e == EnumC14621e.ON_DESTROY && (vip = (abstractC16640e = (AbstractC16640e) f13977e.getValue()).vip((inputMethodManager = (InputMethodManager) this.f13978e.getSystemService("input_method")))) != null) {
            synchronized (vip) {
                View metrica = abstractC16640e.metrica(inputMethodManager);
                if (metrica == null) {
                    return;
                }
                if (metrica.isAttachedToWindow()) {
                    return;
                }
                boolean ad = abstractC16640e.ad(inputMethodManager);
                if (ad) {
                    inputMethodManager.isActive();
                }
            }
        }
    }
}
