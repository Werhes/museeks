package defpackage;

import java.math.BigInteger;
import java.util.Hashtable;

/* renamed from: eُ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17759e extends Cextends {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public firebase f34840e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final String[] f34839e = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final Hashtable f34838e = new Hashtable();

    /* JADX WARN: Type inference failed for: r2v1, types: [eُ٘ٔ, java.lang.Object] */
    public static C17759e loadAd(firebase firebaseVar) {
        if (firebaseVar == null) {
            return null;
        }
        int firebase = firebase.crashlytics(firebaseVar).firebase();
        Integer valueOf = Integer.valueOf(firebase);
        Hashtable hashtable = f34838e;
        if (!hashtable.containsKey(valueOf)) {
            ?? obj = new Object();
            if (firebase < 0) {
                throw new IllegalArgumentException("Invalid CRL reason : not in (0..MAX)");
            }
            obj.f34840e = new firebase(firebase);
            hashtable.put(valueOf, obj);
        }
        return (C17759e) hashtable.get(valueOf);
    }

    @Override // defpackage.Cextends, defpackage.subs
    public final Cdefault billing() {
        return this.f34840e;
    }

    public final String toString() {
        firebase firebaseVar = this.f34840e;
        firebaseVar.getClass();
        int intValue = new BigInteger(firebaseVar.f36394e).intValue();
        return AbstractC17861e.Signature("CRLReason: ", (intValue < 0 || intValue > 10) ? "invalid" : f34839e[intValue]);
    }
}
