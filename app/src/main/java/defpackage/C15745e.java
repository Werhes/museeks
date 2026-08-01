package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۜۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15745e extends Exception {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f31013e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15745e(String str, int i) {
        super(str);
        AbstractC9528e.billing(str, "Provided message must not be empty.");
        this.f31013e = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15745e(String str, Exception exc) {
        super(str, exc);
        AbstractC9528e.billing(str, "Provided message must not be empty.");
        this.f31013e = 13;
    }
}
