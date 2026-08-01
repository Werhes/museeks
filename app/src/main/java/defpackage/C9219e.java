package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؔؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9219e implements InterfaceC16104e {
    public final int ad;
    public final List license;
    public final List metrica;
    public final int vip;

    public C9219e(int i, int i2, List list, List list2) {
        this.ad = i;
        this.vip = i2;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.metrica = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.license = list2;
    }

    public static C9219e appmetrica(int i, int i2, List list, List list2) {
        return new C9219e(i, i2, DesugarCollections.unmodifiableList(new ArrayList(list)), DesugarCollections.unmodifiableList(new ArrayList(list2)));
    }

    @Override // defpackage.InterfaceC16104e
    public final int ad() {
        return this.ad;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9219e) {
            C9219e c9219e = (C9219e) obj;
            if (this.ad == c9219e.ad && this.vip == c9219e.vip && this.metrica.equals(c9219e.metrica) && this.license.equals(c9219e.license)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.ad ^ 1000003) * 1000003) ^ this.vip) * 1000003) ^ this.metrica.hashCode()) * 1000003) ^ this.license.hashCode();
    }

    @Override // defpackage.InterfaceC16104e
    public final List license() {
        return this.license;
    }

    @Override // defpackage.InterfaceC16104e
    public final List metrica() {
        return this.metrica;
    }

    public final String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.ad + ", recommendedFileFormat=" + this.vip + ", audioProfiles=" + this.metrica + ", videoProfiles=" + this.license + "}";
    }

    @Override // defpackage.InterfaceC16104e
    public final int vip() {
        return this.vip;
    }
}
