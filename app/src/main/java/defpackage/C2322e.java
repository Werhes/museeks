package defpackage;

import android.util.Pair;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؒٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2322e extends AbstractC13582e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Pair f5838e;

    public C2322e(Pair pair) {
        this.f5838e = pair;
    }

    @Override // defpackage.AbstractC13582e
    public final Object ad() {
        return this.f5838e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2322e) {
            return this.f5838e.equals(((C2322e) obj).f5838e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5838e.hashCode() + 1502476572;
    }

    public final String toString() {
        return AbstractC5087e.m1746extends("Optional.of(", this.f5838e.toString(), ")");
    }

    @Override // defpackage.AbstractC13582e
    public final boolean vip() {
        return true;
    }
}
