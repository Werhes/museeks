package defpackage;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٚٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11833e {
    public final C10312e ad;
    public final HashMap metrica;
    public final C12894e vip;

    public C11833e(Context context, C12894e c12894e) {
        C10312e c10312e = new C10312e(context, 5);
        this.metrica = new HashMap();
        this.ad = c10312e;
        this.vip = c12894e;
    }

    public final synchronized InterfaceC4231e ad(String str) {
        if (this.metrica.containsKey(str)) {
            return (InterfaceC4231e) this.metrica.get(str);
        }
        CctBackendFactory Signature = this.ad.Signature(str);
        if (Signature == null) {
            return null;
        }
        C12894e c12894e = this.vip;
        InterfaceC4231e create = Signature.create(new C16001e((Context) c12894e.f25751e, (InterfaceC3832e) c12894e.f25750e, (InterfaceC3832e) c12894e.f25752e, str));
        this.metrica.put(str, create);
        return create;
    }
}
