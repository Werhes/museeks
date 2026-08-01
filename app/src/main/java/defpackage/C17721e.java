package defpackage;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْْ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17721e implements InterfaceC1626e {
    public final C6491e ad;
    public final C9257e vip;

    public C17721e(Context context, C9257e c9257e) {
        this.vip = c9257e;
        C12664e c12664e = C12664e.appmetrica;
        C6553e.vip(context);
        C13192e metrica = C6553e.ad().metrica(c12664e);
        if (C12664e.license.contains(new C12007e("json"))) {
            new C6491e(new C1980e(metrica, 0));
        }
        this.ad = new C6491e(new C1980e(metrica, 1));
    }

    @Override // defpackage.InterfaceC1626e
    public final void ad(C9271e c9271e) {
        C2917e c2917e;
        InterfaceC1848e interfaceC1848e;
        C11547e c11547e = (C11547e) this.ad.get();
        C16628e c16628e = C16628e.f32602e;
        C0912e c0912e = (C0912e) c9271e.f18486e;
        ((C14995e) c9271e.f18485e).startapp = false;
        C14995e c14995e = (C14995e) c9271e.f18485e;
        c14995e.billing = Boolean.FALSE;
        c0912e.f3332e = new C7964e(c14995e);
        try {
            C14914e.subscription();
            C17601e c17601e = new C17601e(c0912e);
            C6029e c6029e = new C6029e((byte) 0, 13);
            c16628e.billing(c6029e);
            HashMap hashMap = new HashMap((HashMap) c6029e.f12699e);
            HashMap hashMap2 = new HashMap((HashMap) c6029e.f12698e);
            C11373e c11373e = (C11373e) c6029e.f12700e;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                c2917e = new C2917e(byteArrayOutputStream, hashMap, hashMap2, c11373e);
                interfaceC1848e = (InterfaceC1848e) hashMap.get(C17601e.class);
            } catch (IOException unused) {
            }
            if (interfaceC1848e == null) {
                throw new RuntimeException("No encoder for ".concat(String.valueOf(C17601e.class)));
            }
            interfaceC1848e.ad(c17601e, c2917e);
            c11547e.ad(new C7101e(null, byteArrayOutputStream.toByteArray(), EnumC6651e.f13721e, null), new C11180e(24));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
