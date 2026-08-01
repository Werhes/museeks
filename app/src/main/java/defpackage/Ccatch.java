package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: catch, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class Ccatch extends Cdefault implements Iterable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final inmobi f640e = new inmobi(17, Ccatch.class);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public subs[] f641e;

    public Ccatch() {
        this.f641e = crashlytics.f1115e;
    }

    public Ccatch(crashlytics crashlyticsVar) {
        if (crashlyticsVar == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        this.f641e = crashlyticsVar.m198protected();
    }

    public Ccatch(subs subsVar) {
        if (subsVar == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        this.f641e = new subs[]{subsVar};
    }

    public Ccatch(subs subsVar, subs subsVar2) {
        if (subsVar == null) {
            throw new NullPointerException("'element1' cannot be null");
        }
        if (subsVar2 == null) {
            throw new NullPointerException("'element2' cannot be null");
        }
        this.f641e = new subs[]{subsVar, subsVar2};
    }

    public Ccatch(subs[] subsVarArr) {
        if (subsVarArr != null) {
            for (subs subsVar : subsVarArr) {
                if (subsVar != null) {
                }
            }
            this.f641e = crashlytics.startapp(subsVarArr);
            return;
        }
        throw new NullPointerException("'elements' cannot be null, or contain null");
    }

    public Ccatch(subs[] subsVarArr, int i) {
        this.f641e = subsVarArr;
    }

    /* renamed from: class, reason: not valid java name */
    public static Ccatch m168class(Object obj) {
        if (obj == null || (obj instanceof Ccatch)) {
            return (Ccatch) obj;
        }
        if (obj instanceof subs) {
            Cdefault billing = ((subs) obj).billing();
            if (billing instanceof Ccatch) {
                return (Ccatch) billing;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (Ccatch) f640e.m4631e((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException(AbstractC8703e.admob(e, new StringBuilder("failed to construct sequence from byte[]: ")));
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: ".concat(obj.getClass().getName()));
    }

    public static Ccatch firebase(Cstrictfp cstrictfp, boolean z) {
        return (Ccatch) f640e.m4616e(cstrictfp, z);
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [default, catch, eًٌَ] */
    @Override // defpackage.Cdefault
    public Cdefault ads() {
        ?? ccatch = new Ccatch(this.f641e, 0);
        ccatch.f20096e = -1;
        return ccatch;
    }

    public final Cprotected[] crashlytics() {
        int size = size();
        Cprotected[] cprotectedArr = new Cprotected[size];
        for (int i = 0; i < size; i++) {
            cprotectedArr[i] = Cprotected.subs(this.f641e[i]);
        }
        return cprotectedArr;
    }

    /* renamed from: extends, reason: not valid java name */
    public abstract Cprotected mo169extends();

    /* renamed from: goto, reason: not valid java name */
    public Enumeration mo170goto() {
        return new Ccase(this);
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public int hashCode() {
        int length = this.f641e.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ this.f641e[length].billing().hashCode();
        }
    }

    /* renamed from: interface, reason: not valid java name */
    public subs mo171interface(int i) {
        return this.f641e[i];
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C10661e(1, this.f641e);
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (!(cdefault instanceof Ccatch)) {
            return false;
        }
        Ccatch ccatch = (Ccatch) cdefault;
        int size = size();
        if (ccatch.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            Cdefault billing = this.f641e[i].billing();
            Cdefault billing2 = ccatch.f641e[i].billing();
            if (billing != billing2 && !billing.loadAd(billing2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: native, reason: not valid java name */
    public abstract C4148e mo172native();

    /* JADX WARN: Type inference failed for: r0v0, types: [default, catch, eؚؖٚ] */
    @Override // defpackage.Cdefault
    public Cdefault premium() {
        ?? ccatch = new Ccatch(this.f641e, 0);
        ccatch.f14196e = -1;
        return ccatch;
    }

    public int size() {
        return this.f641e.length;
    }

    public final isPro[] subs() {
        int size = size();
        isPro[] isproArr = new isPro[size];
        for (int i = 0; i < size; i++) {
            isproArr[i] = isPro.firebase(this.f641e[i]);
        }
        return isproArr;
    }

    /* renamed from: this, reason: not valid java name */
    public abstract isPro mo173this();

    /* renamed from: throw, reason: not valid java name */
    public abstract Cfinal mo174throw();

    public final String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            sb.append(this.f641e[i]);
            i++;
            if (i >= size) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
        }
    }
}
