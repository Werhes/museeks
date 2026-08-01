package defpackage;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.os.Build;
import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16961e implements InterfaceC8296e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C12582e f33216e = new C12582e(24);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f33217e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final MediaDrm f33218e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final UUID f33219e;

    public C16961e(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = AbstractC18394e.metrica;
        AbstractC2301e.yandex(!uuid2.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f33219e = uuid;
        MediaDrm mediaDrm = new MediaDrm((Build.VERSION.SDK_INT >= 27 || !uuid.equals(AbstractC18394e.license)) ? uuid : uuid2);
        this.f33218e = mediaDrm;
        this.f33217e = 1;
        if (AbstractC18394e.appmetrica.equals(uuid) && "ASUS_Z00AD".equals(Build.MODEL)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // defpackage.InterfaceC8296e
    public final C18053e adcel() {
        MediaDrm.ProvisionRequest provisionRequest = this.f33218e.getProvisionRequest();
        return new C18053e(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // defpackage.InterfaceC8296e
    public final byte[] advert() {
        return this.f33218e.openSession();
    }

    @Override // defpackage.InterfaceC8296e
    public final void inmobi(byte[] bArr, C5350e c5350e) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                AbstractC16048e.m4101class(this.f33218e, bArr, c5350e);
            } catch (UnsupportedOperationException unused) {
                AbstractC2803e.smaato("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // defpackage.InterfaceC8296e
    public final boolean isPro(String str, byte[] bArr) {
        MediaCrypto mediaCrypto;
        boolean equals;
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.f33219e;
        if (i >= 31) {
            boolean equals2 = uuid.equals(AbstractC18394e.appmetrica);
            MediaDrm mediaDrm = this.f33218e;
            if (equals2) {
                String propertyString = mediaDrm.getPropertyString("version");
                equals = (propertyString.startsWith("v5.") || propertyString.startsWith("14.") || propertyString.startsWith("15.") || propertyString.startsWith("16.0")) ? false : true;
            } else {
                equals = uuid.equals(AbstractC18394e.license);
            }
            if (equals) {
                return AbstractC16048e.subs(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
            }
        }
        MediaCrypto mediaCrypto2 = null;
        try {
            try {
                mediaCrypto = new MediaCrypto((i >= 27 || !Objects.equals(uuid, AbstractC18394e.license)) ? uuid : AbstractC18394e.metrica, bArr);
            } catch (Throwable th) {
                th = th;
            }
        } catch (MediaCryptoException unused) {
        }
        try {
            boolean requiresSecureDecoderComponent = mediaCrypto.requiresSecureDecoderComponent(str);
            mediaCrypto.release();
            return requiresSecureDecoderComponent;
        } catch (MediaCryptoException unused2) {
            mediaCrypto2 = mediaCrypto;
            boolean z = !uuid.equals(AbstractC18394e.license);
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
            mediaCrypto2 = mediaCrypto;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC8296e
    public final int isVip() {
        return 2;
    }

    @Override // defpackage.InterfaceC8296e
    public final void loadAd(byte[] bArr, byte[] bArr2) {
        this.f33218e.restoreKeys(bArr, bArr2);
    }

    @Override // defpackage.InterfaceC8296e
    public final InterfaceC12935e mopub(byte[] bArr) {
        int i = Build.VERSION.SDK_INT;
        UUID uuid = this.f33219e;
        if (i < 27 && Objects.equals(uuid, AbstractC18394e.license)) {
            uuid = AbstractC18394e.metrica;
        }
        return new C2848e(uuid, bArr);
    }

    @Override // defpackage.InterfaceC8296e
    public final void pro(final C6325e c6325e) {
        this.f33218e.setOnEventListener(new MediaDrm.OnEventListener(this) { // from class: eّؒۦ
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i, int i2, byte[] bArr2) {
                HandlerC17797e handlerC17797e = ((C16558e) c6325e.f13170e).f32501e;
                handlerC17797e.getClass();
                handlerC17797e.obtainMessage(i, bArr).sendToTarget();
            }
        });
    }

    @Override // defpackage.InterfaceC8296e
    public final Map purchase(byte[] bArr) {
        return this.f33218e.queryKeyStatus(bArr);
    }

    @Override // defpackage.InterfaceC8296e
    public final synchronized void release() {
        int i = this.f33217e - 1;
        this.f33217e = i;
        if (i == 0) {
            this.f33218e.release();
        }
    }

    @Override // defpackage.InterfaceC8296e
    public final byte[] remoteconfig(byte[] bArr, byte[] bArr2) {
        if (AbstractC18394e.license.equals(this.f33219e) && Build.VERSION.SDK_INT < 27) {
            try {
                String str = AbstractC9413e.ad;
                JSONObject jSONObject = new JSONObject(new String(bArr2, StandardCharsets.UTF_8));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i = 0; i < jSONArray.length(); i++) {
                    if (i != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = sb.toString().getBytes(StandardCharsets.UTF_8);
            } catch (JSONException e) {
                String str2 = AbstractC9413e.ad;
                AbstractC2803e.billing("ClearKeyUtil", "Failed to adjust response data: ".concat(new String(bArr2, StandardCharsets.UTF_8)), e);
            }
        }
        return this.f33218e.provideKeyResponse(bArr, bArr2);
    }

    @Override // defpackage.InterfaceC8296e
    public final void signatures(byte[] bArr) {
        this.f33218e.provideProvisionResponse(bArr);
    }

    @Override // defpackage.InterfaceC8296e
    public final void subscription(byte[] bArr) {
        this.f33218e.closeSession(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x01a5, code lost:
    
        if ("AFTT".equals(r5) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ab, code lost:
    
        if (r5 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0245, code lost:
    
        if (j$.util.Objects.equals(r3, "aidl-1") == false) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0258  */
    @Override // defpackage.InterfaceC8296e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C17344e tapsense(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) {
        /*
            Method dump skipped, instructions count: 610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16961e.tapsense(byte[], java.util.List, int, java.util.HashMap):eَٗۢ");
    }
}
