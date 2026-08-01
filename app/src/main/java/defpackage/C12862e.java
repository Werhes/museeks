package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/* renamed from: eّۤ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12862e extends Cextends implements premium {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Cdefault f25687e;

    public C12862e(Cdefault cdefault) {
        if (!(cdefault instanceof Cprivate) && !(cdefault instanceof Cinterface)) {
            throw new IllegalArgumentException("unknown object passed to Time");
        }
        this.f25687e = cdefault;
    }

    public static C12862e Signature(subs subsVar) {
        if (subsVar == null || (subsVar instanceof C12862e)) {
            return (C12862e) subsVar;
        }
        if (subsVar instanceof Cprivate) {
            return new C12862e((Cprivate) subsVar);
        }
        if (subsVar instanceof Cinterface) {
            return new C12862e((Cinterface) subsVar);
        }
        throw new IllegalArgumentException("unknown object in factory: ".concat(subsVar.getClass().getName()));
    }

    public final String admob() {
        Cdefault cdefault = this.f25687e;
        if (!(cdefault instanceof Cprivate)) {
            return ((Cinterface) cdefault).m4599interface();
        }
        String subs = ((Cprivate) cdefault).subs();
        return subs.charAt(0) < '5' ? "20".concat(subs) : "19".concat(subs);
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return this.f25687e;
    }

    public final Date loadAd() {
        try {
            Cdefault cdefault = this.f25687e;
            if (!(cdefault instanceof Cprivate)) {
                return ((Cinterface) cdefault).firebase();
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmssz", AbstractC13883e.ad);
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
            String subs = ((Cprivate) cdefault).subs();
            return simpleDateFormat.parse((subs.charAt(0) < '5' ? "20" : "19").concat(subs));
        } catch (ParseException e) {
            throw new IllegalStateException("invalid date string: " + e.getMessage());
        }
    }

    public final String toString() {
        return admob();
    }
}
