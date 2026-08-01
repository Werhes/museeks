package defpackage;

/* renamed from: eَٝؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10397e extends Cextends {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C2960e[] f20543e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C10192e f20544e;

    public C10397e(Ccatch ccatch) {
        int i = 0;
        this.f20544e = C10192e.loadAd(ccatch.mo171interface(0));
        Ccatch m168class = Ccatch.m168class(ccatch.mo171interface(1));
        this.f20543e = new C2960e[m168class.size()];
        while (true) {
            C2960e[] c2960eArr = this.f20543e;
            if (i == c2960eArr.length) {
                return;
            }
            c2960eArr[i] = C2960e.loadAd(m168class.mo171interface(i));
            i++;
        }
    }

    public C10397e(C10192e c10192e, C2960e[] c2960eArr) {
        this.f20544e = c10192e;
        C2960e[] c2960eArr2 = new C2960e[c2960eArr.length];
        this.f20543e = c2960eArr2;
        System.arraycopy(c2960eArr, 0, c2960eArr2, 0, c2960eArr.length);
    }

    public static C10397e loadAd(Object obj) {
        if (obj instanceof C10397e) {
            return (C10397e) obj;
        }
        if (obj != null) {
            return new C10397e(Ccatch.m168class(obj));
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        ?? ccatch = new Ccatch(this.f20544e, new C10154e(this.f20543e));
        ccatch.f20096e = -1;
        return ccatch;
    }
}
