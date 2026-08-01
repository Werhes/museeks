package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٜؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10380e extends AbstractC4063e {
    public static final List license = AbstractC6874e.startapp(0, 0, 0, 0, 0, 0, 0, 0, 0);
    public final int metrica;
    public final int vip;

    static {
        AbstractC6874e.startapp(2, 1, 0, 2, 1, 0, 2, 1, 0);
    }

    public C10380e() {
        super(AbstractC1975e.license, license);
        this.vip = 1;
        this.metrica = 9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10380e)) {
            return false;
        }
        C10380e c10380e = (C10380e) obj;
        return this.vip == c10380e.vip && this.metrica == c10380e.metrica;
    }

    public final int hashCode() {
        return (this.vip * 31) + this.metrica;
    }
}
