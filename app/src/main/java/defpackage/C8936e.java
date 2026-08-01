package defpackage;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: eٌۣۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8936e extends Ccatch {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public byte[] f17900e;

    @Override // defpackage.Cdefault
    public final void Signature(C7850e c7850e, boolean z) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f17900e;
        }
        if (bArr != null) {
            c7850e.m2337implements(48, z, bArr);
        } else {
            super.premium().Signature(c7850e, z);
        }
    }

    @Override // defpackage.Ccatch, defpackage.Cdefault
    public final Cdefault ads() {
        m2510while();
        return super.ads();
    }

    @Override // defpackage.Ccatch
    /* renamed from: extends */
    public final Cprotected mo169extends() {
        return ((Ccatch) premium()).mo169extends();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eُۛٓ, java.util.Enumeration, java.lang.Object] */
    @Override // defpackage.Ccatch
    /* renamed from: goto */
    public final Enumeration mo170goto() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f17900e;
        }
        if (bArr == null) {
            return new Ccase(this);
        }
        ?? obj = new Object();
        obj.ad = new Cgoto(0, bArr);
        obj.vip = obj.ad();
        return obj;
    }

    @Override // defpackage.Ccatch, defpackage.Cdefault, defpackage.Cextends
    public final int hashCode() {
        m2510while();
        return super.hashCode();
    }

    @Override // defpackage.Ccatch
    /* renamed from: interface */
    public final subs mo171interface(int i) {
        m2510while();
        return this.f641e[i];
    }

    @Override // defpackage.Ccatch, java.lang.Iterable
    public final Iterator iterator() {
        m2510while();
        return super.iterator();
    }

    @Override // defpackage.Ccatch
    /* renamed from: native */
    public final C4148e mo172native() {
        return ((Ccatch) premium()).mo172native();
    }

    @Override // defpackage.Ccatch, defpackage.Cdefault
    public final Cdefault premium() {
        m2510while();
        return super.premium();
    }

    @Override // defpackage.Cdefault
    public final int remoteconfig(boolean z) {
        byte[] bArr;
        synchronized (this) {
            bArr = this.f17900e;
        }
        return bArr != null ? C7850e.m2327goto(bArr.length, z) : super.premium().remoteconfig(z);
    }

    @Override // defpackage.Ccatch
    public final int size() {
        m2510while();
        return this.f641e.length;
    }

    @Override // defpackage.Ccatch
    /* renamed from: this */
    public final isPro mo173this() {
        return ((Ccatch) premium()).mo173this();
    }

    @Override // defpackage.Ccatch
    /* renamed from: throw */
    public final Cfinal mo174throw() {
        return ((Ccatch) premium()).mo174throw();
    }

    /* renamed from: while, reason: not valid java name */
    public final synchronized void m2510while() {
        crashlytics crashlyticsVar;
        if (this.f17900e != null) {
            Cgoto cgoto = new Cgoto(0, this.f17900e);
            try {
                Cdefault Signature = cgoto.Signature();
                if (Signature == null) {
                    crashlyticsVar = new crashlytics(0, 0);
                } else {
                    crashlytics crashlyticsVar2 = new crashlytics((byte) 0, 0);
                    do {
                        crashlyticsVar2.appmetrica(Signature);
                        Signature = cgoto.Signature();
                    } while (Signature != null);
                    crashlyticsVar = crashlyticsVar2;
                }
                cgoto.close();
                this.f641e = crashlyticsVar.m198protected();
                this.f17900e = null;
            } catch (IOException e) {
                throw new Cabstract("malformed ASN.1: " + e, e, 0);
            }
        }
    }
}
