package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؓۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9213e {
    public final EnumC12770e ad;
    public final int vip;
    public static final C9213e metrica = new C9213e(EnumC12770e.f25549e, 0);
    public static final C9213e license = new C9213e(EnumC12770e.f25551e, 1);

    public C9213e(EnumC12770e enumC12770e, int i) {
        this.ad = enumC12770e;
        this.vip = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9213e.class != obj.getClass()) {
            return false;
        }
        C9213e c9213e = (C9213e) obj;
        return this.ad == c9213e.ad && this.vip == c9213e.vip;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.ad);
        sb.append(" ");
        int i = this.vip;
        sb.append(i != 1 ? i != 2 ? "null" : "slice" : "meet");
        return sb.toString();
    }
}
