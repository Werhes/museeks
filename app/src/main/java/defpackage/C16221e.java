package defpackage;

/* renamed from: eٖٕؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16221e extends Cextends {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Cfinal f31872e;

    /* JADX WARN: Type inference failed for: r0v1, types: [eٖٕؕ, java.lang.Object] */
    public static C16221e Signature(subs subsVar) {
        if (subsVar instanceof C16221e) {
            return (C16221e) subsVar;
        }
        if (subsVar == null) {
            return null;
        }
        Cfinal crashlytics = Cfinal.crashlytics(subsVar);
        ?? obj = new Object();
        obj.f31872e = crashlytics;
        return obj;
    }

    public final C0153e[] admob() {
        Cfinal cfinal = this.f31872e;
        int length = cfinal.f36388e.length;
        C0153e[] c0153eArr = new C0153e[length];
        for (int i = 0; i != length; i++) {
            c0153eArr[i] = C0153e.loadAd(cfinal.f36388e[i]);
        }
        return c0153eArr;
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return this.f31872e;
    }

    public final C0153e loadAd() {
        subs[] subsVarArr = this.f31872e.f36388e;
        if (subsVarArr.length == 0) {
            return null;
        }
        return C0153e.loadAd(subsVarArr[0]);
    }
}
