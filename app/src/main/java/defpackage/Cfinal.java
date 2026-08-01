package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: final, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class Cfinal extends Cdefault implements Iterable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final inmobi f36386e = new inmobi(18, Cfinal.class);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public subs[] f36387e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final subs[] f36388e;

    public Cfinal() {
        subs[] subsVarArr = crashlytics.f1115e;
        this.f36388e = subsVarArr;
        this.f36387e = subsVarArr;
    }

    public Cfinal(crashlytics crashlyticsVar, boolean z) {
        subs[] m198protected;
        int i;
        if (crashlyticsVar == null) {
            throw new NullPointerException("'elementVector' cannot be null");
        }
        if (!z || (i = crashlyticsVar.f1117e) < 2) {
            m198protected = crashlyticsVar.m198protected();
        } else {
            if (i == 0) {
                m198protected = crashlytics.f1115e;
            } else {
                subs[] subsVarArr = new subs[i];
                System.arraycopy((subs[]) crashlyticsVar.f1119e, 0, subsVarArr, 0, i);
                m198protected = subsVarArr;
            }
            m4589class(m198protected);
        }
        this.f36388e = m198protected;
        if (!z && m198protected.length >= 2) {
            m198protected = null;
        }
        this.f36387e = m198protected;
    }

    public Cfinal(subs subsVar) {
        if (subsVar == null) {
            throw new NullPointerException("'element' cannot be null");
        }
        subs[] subsVarArr = {subsVar};
        this.f36388e = subsVarArr;
        this.f36387e = subsVarArr;
    }

    public Cfinal(boolean z, subs[] subsVarArr) {
        this.f36388e = subsVarArr;
        if (!z && subsVarArr.length >= 2) {
            subsVarArr = null;
        }
        this.f36387e = subsVarArr;
    }

    public Cfinal(subs[] subsVarArr) {
        for (subs subsVar : subsVarArr) {
            if (subsVar == null) {
                throw new NullPointerException("'elements' cannot be null, or contain null");
            }
        }
        subs[] startapp = crashlytics.startapp(subsVarArr);
        if (startapp.length >= 2) {
            m4589class(startapp);
        }
        this.f36388e = startapp;
        this.f36387e = subsVarArr;
    }

    public Cfinal(subs[] subsVarArr, subs[] subsVarArr2) {
        this.f36388e = subsVarArr;
        this.f36387e = subsVarArr2;
    }

    /* renamed from: class, reason: not valid java name */
    public static void m4589class(subs[] subsVarArr) {
        int i;
        int length = subsVarArr.length;
        if (length < 2) {
            return;
        }
        subs subsVar = subsVarArr[0];
        subs subsVar2 = subsVarArr[1];
        byte[] subs = subs(subsVar);
        byte[] subs2 = subs(subsVar2);
        if (firebase(subs2, subs)) {
            subsVar2 = subsVar;
            subsVar = subsVar2;
            subs2 = subs;
            subs = subs2;
        }
        for (int i2 = 2; i2 < length; i2++) {
            subs subsVar3 = subsVarArr[i2];
            byte[] subs3 = subs(subsVar3);
            if (firebase(subs2, subs3)) {
                subsVarArr[i2 - 2] = subsVar;
                subsVar = subsVar2;
                subs = subs2;
                subsVar2 = subsVar3;
                subs2 = subs3;
            } else if (firebase(subs, subs3)) {
                subsVarArr[i2 - 2] = subsVar;
                subsVar = subsVar3;
                subs = subs3;
            } else {
                int i3 = i2 - 1;
                while (true) {
                    i = i3 - 1;
                    if (i <= 0) {
                        break;
                    }
                    subs subsVar4 = subsVarArr[i3 - 2];
                    if (firebase(subs(subsVar4), subs3)) {
                        break;
                    }
                    subsVarArr[i] = subsVar4;
                    i3 = i;
                }
                subsVarArr[i] = subsVar3;
            }
        }
        subsVarArr[length - 2] = subsVar;
        subsVarArr[length - 1] = subsVar2;
    }

    public static Cfinal crashlytics(Object obj) {
        if (obj == null || (obj instanceof Cfinal)) {
            return (Cfinal) obj;
        }
        if (obj instanceof subs) {
            Cdefault billing = ((subs) obj).billing();
            if (billing instanceof Cfinal) {
                return (Cfinal) billing;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (Cfinal) f36386e.m4631e((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException(AbstractC8703e.admob(e, new StringBuilder("failed to construct set from byte[]: ")));
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: ".concat(obj.getClass().getName()));
    }

    public static boolean firebase(byte[] bArr, byte[] bArr2) {
        int i = bArr[0] & 223;
        int i2 = bArr2[0] & 223;
        if (i != i2) {
            return i < i2;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i3 = 1; i3 < min; i3++) {
            byte b = bArr[i3];
            byte b2 = bArr2[i3];
            if (b != b2) {
                return (b & 255) < (b2 & 255);
            }
        }
        return (bArr[min] & 255) <= (bArr2[min] & 255);
    }

    public static byte[] subs(subs subsVar) {
        try {
            return subsVar.billing().smaato();
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    @Override // defpackage.Cdefault
    public final boolean admob() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [default, final, eْٚٛ] */
    @Override // defpackage.Cdefault
    public Cdefault ads() {
        if (this.f36387e == null) {
            subs[] subsVarArr = (subs[]) this.f36388e.clone();
            this.f36387e = subsVarArr;
            m4589class(subsVarArr);
        }
        ?? cfinal = new Cfinal(true, this.f36387e);
        cfinal.f26600e = -1;
        return cfinal;
    }

    @Override // defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        subs[] subsVarArr = this.f36388e;
        int length = subsVarArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i += subsVarArr[length].billing().hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C10661e(1, crashlytics.startapp(this.f36388e));
    }

    @Override // defpackage.Cdefault
    public final boolean loadAd(Cdefault cdefault) {
        if (cdefault instanceof Cfinal) {
            Cfinal cfinal = (Cfinal) cdefault;
            int length = this.f36388e.length;
            if (cfinal.f36388e.length == length) {
                C13346e c13346e = (C13346e) ads();
                C13346e c13346e2 = (C13346e) cfinal.ads();
                for (int i = 0; i < length; i++) {
                    Cdefault billing = c13346e.f36388e[i].billing();
                    Cdefault billing2 = c13346e2.f36388e[i].billing();
                    if (billing == billing2 || billing.loadAd(billing2)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [default, final, eؚؕٓ] */
    @Override // defpackage.Cdefault
    public Cdefault premium() {
        ?? cfinal = new Cfinal(this.f36388e, this.f36387e);
        cfinal.f7323e = -1;
        return cfinal;
    }

    public final String toString() {
        subs[] subsVarArr = this.f36388e;
        int length = subsVarArr.length;
        if (length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            sb.append(subsVarArr[i]);
            i++;
            if (i >= length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
        }
    }
}
