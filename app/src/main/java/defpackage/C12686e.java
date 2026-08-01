package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۗ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12686e implements Comparable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f25423e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String f25424e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f25425e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object f25426e;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f25423e, ((C12686e) obj).f25423e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(string: ");
        sb.append(this.f25424e);
        sb.append(", score: ");
        sb.append(this.f25423e);
        sb.append(", index: ");
        return AbstractC17861e.smaato(this.f25425e, ")", sb);
    }
}
