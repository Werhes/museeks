package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: default, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class Cdefault extends Cextends {
    public static Cdefault inmobi(byte[] bArr) {
        Cgoto cgoto = new Cgoto(bArr);
        try {
            Cdefault Signature = cgoto.Signature();
            if (cgoto.available() == 0) {
                return Signature;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    public abstract void Signature(C7850e c7850e, boolean z);

    public abstract boolean admob();

    public Cdefault ads() {
        return this;
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return this;
    }

    @Override // defpackage.Cextends
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof subs) && loadAd(((subs) obj).billing());
    }

    @Override // defpackage.Cextends
    public abstract int hashCode();

    public final boolean isVip(Cdefault cdefault) {
        return this == cdefault || loadAd(cdefault);
    }

    public abstract boolean loadAd(Cdefault cdefault);

    public Cdefault premium() {
        return this;
    }

    public abstract int remoteconfig(boolean z);

    public final void subscription(OutputStream outputStream, String str) {
        (str.equals("DER") ? new C7850e(1, outputStream) : str.equals("DL") ? new C7850e(1, outputStream) : new C7850e(1, outputStream)).mo2342strictfp(this);
    }

    public final boolean tapsense(subs subsVar) {
        if (this != subsVar) {
            return subsVar != null && loadAd(subsVar.billing());
        }
        return true;
    }
}
