package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٗؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16786e {
    public final Class ad;
    public final Class vip;

    public C16786e(Class cls, Class cls2) {
        this.ad = cls;
        this.vip = cls2;
    }

    public static C16786e ad(Class cls) {
        return new C16786e(InterfaceC13235e.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C16786e.class != obj.getClass()) {
            return false;
        }
        C16786e c16786e = (C16786e) obj;
        if (this.vip.equals(c16786e.vip)) {
            return this.ad.equals(c16786e.ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode() + (this.vip.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.vip;
        Class cls2 = this.ad;
        if (cls2 == InterfaceC13235e.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
