package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C18218e.class)
/* renamed from: eؗٓ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4879e {
    public static final C18463e Companion = new Object();

    public abstract int appmetrica();

    public final void billing(int i) {
        if (appmetrica() == i) {
            return;
        }
        throw new C6301e(0, "Value expected to be of type " + AbstractC10257e.isPro(i) + " is of unexpected type " + AbstractC10257e.isPro(appmetrica()), null);
    }
}
