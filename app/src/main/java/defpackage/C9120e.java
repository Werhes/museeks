package defpackage;

/* renamed from: eٌۦٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9120e extends Cextends {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C5547e[] f18275e;

    public C9120e(Ccatch ccatch) {
        this.f18275e = new C5547e[ccatch.size()];
        for (int i = 0; i != ccatch.size(); i++) {
            this.f18275e[i] = C5547e.loadAd(ccatch.mo171interface(i));
        }
    }

    public C9120e(C5547e c5547e) {
        this.f18275e = new C5547e[]{c5547e};
    }

    public static C9120e loadAd(Object obj) {
        if (obj instanceof C9120e) {
            return (C9120e) obj;
        }
        if (obj != null) {
            return new C9120e(Ccatch.m168class(obj));
        }
        return null;
    }

    public final C5547e[] Signature() {
        C5547e[] c5547eArr = this.f18275e;
        C5547e[] c5547eArr2 = new C5547e[c5547eArr.length];
        System.arraycopy(c5547eArr, 0, c5547eArr2, 0, c5547eArr.length);
        return c5547eArr2;
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return new C10154e(this.f18275e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeneralNames:");
        String str = AbstractC1433e.ad;
        sb.append(str);
        int i = 0;
        while (true) {
            C5547e[] c5547eArr = this.f18275e;
            if (i == c5547eArr.length) {
                return sb.toString();
            }
            sb.append("    ");
            sb.append(c5547eArr[i]);
            sb.append(str);
            i++;
        }
    }
}
