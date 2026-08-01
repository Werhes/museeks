package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؔٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10023e implements InterfaceC10799e {
    public static final C10023e ad = new Object();

    @Override // defpackage.InterfaceC10799e
    public final InterfaceC12864e ad(InterfaceC12864e interfaceC12864e, float f, boolean z) {
        if (f <= 0.0d) {
            AbstractC9534e.ad("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return interfaceC12864e.premium(new C5228e(f, true));
    }
}
