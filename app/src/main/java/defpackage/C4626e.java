package defpackage;

import java.util.Iterator;

/* renamed from: eؗؔۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4626e extends Cextends implements Iterable {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final subs[] f9961e;

    public C4626e(Ccatch ccatch) {
        this.f9961e = new subs[ccatch.size()];
        int i = 0;
        while (true) {
            subs[] subsVarArr = this.f9961e;
            if (i == subsVarArr.length) {
                return;
            }
            subs mo171interface = ccatch.mo171interface(i);
            subsVarArr[i] = mo171interface instanceof C1098e ? (C1098e) mo171interface : mo171interface != null ? new C1098e(Ccatch.m168class(mo171interface)) : null;
            i++;
        }
    }

    public C4626e(C1098e[] c1098eArr) {
        subs[] subsVarArr = new subs[c1098eArr.length];
        this.f9961e = subsVarArr;
        System.arraycopy(c1098eArr, 0, subsVarArr, 0, c1098eArr.length);
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return new C10154e(this.f9961e);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C10661e(1, this.f9961e);
    }
}
