package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؑٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0464e extends AbstractC0424e {
    public C0464e(C6276e c6276e, byte b) {
        super(b);
        if (license()) {
            C7936e c7936e = C6276e.f13084e;
            EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
            AbstractC6069e.vip(this.ad);
            c7936e.getClass();
            int i = C1724e.ad;
        }
        if (vip()) {
            C7936e c7936e2 = C6276e.f13084e;
            EnumC1005e[] enumC1005eArr2 = EnumC1005e.f3456e;
            c7936e2.getClass();
            int i2 = C1724e.ad;
        }
        if (metrica()) {
            C7936e c7936e3 = C6276e.f13084e;
            EnumC1005e[] enumC1005eArr3 = EnumC1005e.f3456e;
            c7936e3.getClass();
            int i3 = C1724e.ad;
        }
        if ((this.ad & 32) > 0) {
            C7936e c7936e4 = C6276e.f13084e;
            EnumC1005e[] enumC1005eArr4 = EnumC1005e.f3456e;
            c7936e4.getClass();
            int i4 = C1724e.ad;
        }
    }

    public final boolean license() {
        byte b = this.ad;
        return (b & 16) > 0 || (b & 8) > 0 || (b & 4) > 0 || (b & 2) > 0 || (b & 1) > 0;
    }

    public final boolean metrica() {
        return (this.ad & 64) > 0;
    }

    public final boolean vip() {
        return (this.ad & 128) > 0;
    }
}
