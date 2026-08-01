package defpackage;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* renamed from: case, reason: invalid class name */
/* loaded from: classes3.dex */
public final class Ccase implements Enumeration {
    public int ad = 0;
    public final /* synthetic */ Ccatch vip;

    public Ccase(Ccatch ccatch) {
        this.vip = ccatch;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.ad < this.vip.f641e.length;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        int i = this.ad;
        subs[] subsVarArr = this.vip.f641e;
        if (i >= subsVarArr.length) {
            throw new NoSuchElementException();
        }
        this.ad = i + 1;
        return subsVarArr[i];
    }
}
