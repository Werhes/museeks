package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٕٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15324e implements InterfaceC6034e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4760e f30244e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30245e;

    public /* synthetic */ C15324e(C4760e c4760e, int i) {
        this.f30245e = i;
        this.f30244e = c4760e;
    }

    @Override // defpackage.InterfaceC6034e
    public final Object startapp(Object obj, InterfaceC5083e interfaceC5083e) {
        switch (this.f30245e) {
            case 0:
                AbstractC8434e abstractC8434e = (AbstractC8434e) obj;
                C4760e c4760e = this.f30244e;
                C9485e c9485e = c4760e.metrica;
                if (abstractC8434e instanceof C3064e) {
                    if (!((C3064e) abstractC8434e).ad.equals(c9485e.ad)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    C4760e.ad(c4760e, abstractC8434e);
                } else if (abstractC8434e instanceof C5716e) {
                    if (!AbstractC7890e.billing(((C5716e) abstractC8434e).ad, c9485e.ad)) {
                        throw new IllegalStateException("Check failed.");
                    }
                    C4760e.ad(c4760e, abstractC8434e);
                }
                return Unit.INSTANCE;
            default:
                C4760e.ad(this.f30244e, C12448e.ad);
                return Unit.INSTANCE;
        }
    }
}
