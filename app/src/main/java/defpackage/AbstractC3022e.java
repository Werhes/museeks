package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۧۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3022e {
    public static final List ad = AbstractC6874e.startapp("***, dd MMM YYYY hh:mm:ss zzz", "****, dd-MMM-YYYY hh:mm:ss zzz", "*** MMM d hh:mm:ss YYYY", "***, dd-MMM-YYYY hh:mm:ss zzz", "***, dd-MMM-YYYY hh-mm-ss zzz", "***, dd MMM YYYY hh:mm:ss zzz", "*** dd-MMM-YYYY hh:mm:ss zzz", "*** dd MMM YYYY hh:mm:ss zzz", "*** dd-MMM-YYYY hh-mm-ss zzz", "***,dd-MMM-YYYY hh:mm:ss zzz", "*** MMM d YYYY hh:mm:ss zzz");

    /* JADX WARN: Type inference failed for: r3v0, types: [eؑۤۨ, java.lang.Object] */
    public static final C17476e ad(String str) {
        String obj = AbstractC5304e.m1855const(str).toString();
        try {
            return AbstractC6100e.advert(obj);
        } catch (C2486e unused) {
            String obj2 = AbstractC5304e.m1855const(obj).toString();
            for (String str2 : ad) {
                try {
                    ?? obj3 = new Object();
                    obj3.ad = str2;
                    if (str2.length() > 0) {
                        return obj3.appmetrica(obj);
                    }
                    throw new IllegalStateException("Date parser pattern shouldn't be empty.");
                } catch (C17286e unused2) {
                }
            }
            throw new IllegalStateException(("Failed to parse date: " + obj2).toString());
        }
    }
}
