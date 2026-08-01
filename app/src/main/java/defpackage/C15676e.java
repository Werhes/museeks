package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۘٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15676e implements InterfaceC17353e {
    public final C17280e ad;
    public final C12204e appmetrica;
    public final InterfaceC12541e license;
    public final C2107e metrica;
    public final C9485e vip;

    public C15676e(C17280e c17280e, C9485e c9485e, C2107e c2107e, InterfaceC12541e interfaceC12541e, C12204e c12204e) {
        this.ad = c17280e;
        this.vip = c9485e;
        this.metrica = c2107e;
        this.license = interfaceC12541e;
        this.appmetrica = c12204e;
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC17353e
    public final InterfaceC13821e ad(InterfaceC18069e interfaceC18069e, Map map, C13135e c13135e) {
        InterfaceC2196e interfaceC2196e;
        C9485e c9485e = this.vip;
        if (c9485e.yandex != 2) {
            throw new IllegalArgumentException("Unsupported session mode: " + ((Object) AbstractC7291e.adcel(this.vip.yandex)) + " for Extension CameraGraph");
        }
        Object obj = c9485e.billing.get(AbstractC12227e.ad);
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        if (num == null) {
            throw new IllegalStateException("The CameraPipeKeys.camera2ExtensionMode must be set in the sessionParameters of the CameraGraph.Config when creating an Extension CameraGraph.");
        }
        int intValue = num.intValue();
        if (this.vip.license != null) {
            throw new IllegalStateException("Reprocessing is not supported for Extensions");
        }
        C9000e c9000e = (C9000e) ((C7520e) this.license).appmetrica(interfaceC18069e.advert());
        Set set = (Set) c9000e.f18067e.getValue();
        C12204e c12204e = this.appmetrica;
        if (!set.contains(Integer.valueOf(intValue))) {
            c12204e.getClass();
            Log.w("CXCP", interfaceC18069e + " does not support extension mode " + intValue + ". Supported extensions are " + set);
        }
        if (this.vip.appmetrica != null) {
            synchronized (c9000e.f18068e) {
                interfaceC2196e = (InterfaceC2196e) c9000e.f18068e.get(Integer.valueOf(intValue));
            }
            if (interfaceC2196e == null) {
                interfaceC2196e = c9000e.f18061e.license(intValue, c9000e.f18066e);
                synchronized (c9000e.f18068e) {
                    c9000e.f18068e.put(Integer.valueOf(intValue), interfaceC2196e);
                    Unit unit = Unit.INSTANCE;
                }
            }
            C12204e c12204e2 = this.appmetrica;
            if (!((Boolean) ((C2303e) interfaceC2196e).f5822e.getValue()).booleanValue()) {
                c12204e2.getClass();
                Log.w("CXCP", interfaceC18069e + " does not support Postview streams");
            }
            if (this.vip.appmetrica.ad.size() != 1) {
                throw new IllegalStateException("Postview streams can only have one OutputStream.config object");
            }
        }
        C5138e license = AbstractC12026e.license(this.vip, this.metrica, map);
        if (license.ad.isEmpty()) {
            Log.w("CXCP", "Failed to create OutputConfigurations for " + this.vip);
            c13135e.ad();
            return C4590e.f9880e;
        }
        if (!license.vip.isEmpty()) {
            throw new IllegalStateException("Deferred output is not supported for Extensions");
        }
        C13274e c13274e = new C13274e(c13135e);
        ArrayList arrayList = license.ad;
        ExecutorC13626e executorC13626e = new ExecutorC13626e(this.ad.ad(), 1);
        C9485e c9485e2 = this.vip;
        if (interfaceC18069e.mo3563else(new C18240e(arrayList, executorC13626e, c13135e, c9485e2.purchase, c9485e2.billing, Integer.valueOf(intValue), c13274e, license.metrica))) {
            return new C16336e(license.vip, license.license);
        }
        Log.w("CXCP", "Failed to create ExtensionCaptureSession from " + interfaceC18069e + " for " + c13135e + '!');
        c13135e.ad();
        return C4590e.f9880e;
    }
}
