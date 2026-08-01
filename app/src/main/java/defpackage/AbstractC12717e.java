package defpackage;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12717e {
    static {
        int i = C14425e.CONFIG_NAME_FIELD_NUMBER;
        try {
            ad();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void ad() {
        C17895e c17895e = C17895e.vip;
        c17895e.vip(C15761e.appmetrica);
        c17895e.ad(C15761e.purchase);
        if (AbstractC17852e.ad()) {
            return;
        }
        C9938e c9938e = AbstractC15115e.ad;
        if (!AbstractC1786e.startapp(1)) {
            throw new GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
        }
        C13507e c13507e = AbstractC9960e.ad;
        C15619e c15619e = C15619e.vip;
        c15619e.purchase(AbstractC9960e.ad);
        c15619e.appmetrica(AbstractC9960e.vip);
        c15619e.license(AbstractC9960e.metrica);
        c15619e.metrica(AbstractC9960e.license);
        c17895e.ad(AbstractC15115e.ad);
        C14286e c14286e = C14286e.vip;
        HashMap hashMap = new HashMap();
        hashMap.put("AES256_SIV", AbstractC13970e.ad);
        C17424e vip = C14664e.vip();
        vip.m4318native(64);
        vip.f34141e = C8776e.license;
        hashMap.put("AES256_SIV_RAW", vip.loadAd());
        c14286e.vip(DesugarCollections.unmodifiableMap(hashMap));
        C12722e.vip.ad(AbstractC15115e.metrica, C14664e.class);
        C1825e.vip.ad(AbstractC15115e.license, C14664e.class);
        C11731e.license.license(AbstractC15115e.vip, true);
    }
}
