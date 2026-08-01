package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِّٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11731e {
    public static final C11731e license;
    public static final Logger metrica = Logger.getLogger(C11731e.class.getName());
    public ConcurrentHashMap ad;
    public ConcurrentHashMap vip;

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, eِّٓ] */
    static {
        ?? obj = new Object();
        obj.ad = new ConcurrentHashMap();
        obj.vip = new ConcurrentHashMap();
        license = obj;
    }

    public final InterfaceC7024e ad(Class cls, String str) {
        InterfaceC7024e vip = vip(str);
        if (((C11159e) vip).vip.equals(cls)) {
            return vip;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + vip.getClass() + ", which only supports: " + ((C11159e) vip).vip);
    }

    public final synchronized void appmetrica(InterfaceC7024e interfaceC7024e, int i, boolean z) {
        if (!(i != 1 ? AbstractC1786e.adcel(i) : AbstractC1786e.startapp(i))) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        metrica(interfaceC7024e, z);
    }

    public final synchronized void license(InterfaceC7024e interfaceC7024e, boolean z) {
        appmetrica(interfaceC7024e, 1, z);
    }

    public final synchronized void metrica(InterfaceC7024e interfaceC7024e, boolean z) {
        try {
            String str = ((C11159e) interfaceC7024e).ad;
            if (z && this.vip.containsKey(str) && !((Boolean) this.vip.get(str)).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
            }
            InterfaceC7024e interfaceC7024e2 = (InterfaceC7024e) this.ad.get(str);
            if (interfaceC7024e2 != null && !interfaceC7024e2.getClass().equals(interfaceC7024e.getClass())) {
                metrica.warning("Attempted overwrite of a registered key manager for key type ".concat(str));
                throw new GeneralSecurityException("typeUrl (" + str + ") is already registered with " + interfaceC7024e2.getClass().getName() + ", cannot be re-registered with " + interfaceC7024e.getClass().getName());
            }
            this.ad.putIfAbsent(str, interfaceC7024e);
            this.vip.put(str, Boolean.valueOf(z));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized InterfaceC7024e vip(String str) {
        if (!this.ad.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str + ", see https://developers.google.com/tink/faq/registration_errors");
        }
        return (InterfaceC7024e) this.ad.get(str);
    }
}
