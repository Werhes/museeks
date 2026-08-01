package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leُْ;", "Leِٝؓ;", "Leؚۙٓ;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eُْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10966e extends AbstractC11865e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f21721e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final float f21722e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final float f21723e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final float f21724e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final float f21725e;

    public C10966e(float f, float f2, float f3, float f4, boolean z) {
        this.f21725e = f;
        this.f21723e = f2;
        this.f21722e = f3;
        this.f21724e = f4;
        this.f21721e = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C10966e(float r3, float r4, float r5, float r6, boolean r7, int r8) {
        /*
            r2 = this;
            r0 = r8 & 1
            r1 = 2143289344(0x7fc00000, float:NaN)
            if (r0 == 0) goto L7
            r3 = r1
        L7:
            r0 = r8 & 2
            if (r0 == 0) goto Lc
            r4 = r1
        Lc:
            r0 = r8 & 4
            if (r0 == 0) goto L11
            r5 = r1
        L11:
            r8 = r8 & 8
            if (r8 == 0) goto L1c
            r8 = r7
            r7 = r1
        L17:
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            goto L1f
        L1c:
            r8 = r7
            r7 = r6
            goto L17
        L1f:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10966e.<init>(float, float, float, float, boolean, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10966e)) {
            return false;
        }
        C10966e c10966e = (C10966e) obj;
        return C15765e.vip(this.f21725e, c10966e.f21725e) && C15765e.vip(this.f21723e, c10966e.f21723e) && C15765e.vip(this.f21722e, c10966e.f21722e) && C15765e.vip(this.f21724e, c10966e.f21724e) && this.f21721e == c10966e.f21721e;
    }

    public final int hashCode() {
        return AbstractC1414e.license(AbstractC1414e.license(AbstractC1414e.license(Float.floatToIntBits(this.f21725e) * 31, this.f21723e, 31), this.f21722e, 31), this.f21724e, 31) + (this.f21721e ? 1231 : 1237);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؚۙٓ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f15181e = this.f21725e;
        abstractC13616e.f15182e = this.f21723e;
        abstractC13616e.f15180e = this.f21722e;
        abstractC13616e.f15179e = this.f21724e;
        abstractC13616e.f15183e = this.f21721e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C7419e c7419e = (C7419e) abstractC13616e;
        c7419e.f15181e = this.f21725e;
        c7419e.f15182e = this.f21723e;
        c7419e.f15180e = this.f21722e;
        c7419e.f15179e = this.f21724e;
        c7419e.f15183e = this.f21721e;
    }
}
