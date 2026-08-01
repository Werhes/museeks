package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۛۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2863e {
    public static final ConcurrentHashMap ad = new ConcurrentHashMap();

    public static final InterfaceC3055e ad(InterfaceC7227e interfaceC7227e) {
        InterfaceC7227e interfaceC7227e2;
        ConcurrentHashMap concurrentHashMap = ad;
        Object obj = concurrentHashMap.get(interfaceC7227e);
        if (obj != null) {
            if (obj instanceof InterfaceC3055e) {
                return (InterfaceC3055e) obj;
            }
            return null;
        }
        Object billing = AbstractC14437e.billing(interfaceC7227e);
        if (billing == null) {
            try {
                try {
                    interfaceC7227e2 = AbstractC3820e.ad.vip(Class.forName(((InterfaceC18155e) interfaceC7227e).subs().getName().concat("$Companion")));
                } catch (ClassNotFoundException unused) {
                    interfaceC7227e2 = AbstractC3820e.ad.vip(Class.forName(((InterfaceC18155e) interfaceC7227e).subs().getName().concat("$CREATOR")));
                }
            } catch (ClassNotFoundException unused2) {
                interfaceC7227e2 = null;
            }
            Object loadAd = interfaceC7227e2 != null ? interfaceC7227e2.loadAd() : null;
            billing = loadAd instanceof InterfaceC3055e ? (InterfaceC3055e) loadAd : null;
            if (billing == null) {
                billing = interfaceC7227e;
            }
        }
        concurrentHashMap.put(interfaceC7227e, billing);
        if (billing instanceof InterfaceC3055e) {
            return (InterfaceC3055e) billing;
        }
        return null;
    }

    public static final InterfaceC3055e vip(InterfaceC7227e interfaceC7227e) {
        InterfaceC3055e ad2 = ad(interfaceC7227e);
        if (ad2 != null) {
            return ad2;
        }
        throw new IllegalStateException(("Couldn't find companion object of class '" + interfaceC7227e.mopub() + "'.\nA common cause for this is when the `io.realm.kotlin` is not applied to the Gradle module that contains the '" + interfaceC7227e.mopub() + "' class.").toString());
    }
}
