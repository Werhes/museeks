package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8506e implements InterfaceC16665e {
    public final InterfaceC16665e metrica;
    public final String vip;

    public C8506e(String str, InterfaceC16665e interfaceC16665e) {
        this.vip = str;
        this.metrica = interfaceC16665e;
    }

    @Override // defpackage.InterfaceC16665e
    public final String getName() {
        return this.vip;
    }

    public final String toString() {
        String str = this.vip;
        InterfaceC16665e interfaceC16665e = this.metrica;
        if (interfaceC16665e == null) {
            return str;
        }
        return interfaceC16665e + "." + str;
    }
}
