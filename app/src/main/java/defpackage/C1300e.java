package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۚؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1300e implements InterfaceC9660e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public C7074e f4012e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC9660e f4013e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C6300e f4014e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final ArrayList f4015e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C12584e f4016e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public InterfaceC9660e f4017e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C2950e f4018e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C7128e f4019e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Context f4020e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public InterfaceC9660e f4021e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C0068e f4022e;

    public C1300e(Context context, InterfaceC9660e interfaceC9660e) {
        this.f4020e = context.getApplicationContext();
        interfaceC9660e.getClass();
        this.f4013e = interfaceC9660e;
        this.f4015e = new ArrayList();
    }

    public static void Signature(InterfaceC9660e interfaceC9660e, InterfaceC4407e interfaceC4407e) {
        if (interfaceC9660e != null) {
            interfaceC9660e.license(interfaceC4407e);
        }
    }

    @Override // defpackage.InterfaceC9660e
    public final Map advert() {
        InterfaceC9660e interfaceC9660e = this.f4017e;
        return interfaceC9660e == null ? Collections.EMPTY_MAP : interfaceC9660e.advert();
    }

    @Override // defpackage.InterfaceC9660e
    public final void close() {
        InterfaceC9660e interfaceC9660e = this.f4017e;
        if (interfaceC9660e != null) {
            try {
                interfaceC9660e.close();
            } finally {
                this.f4017e = null;
            }
        }
    }

    @Override // defpackage.InterfaceC9660e
    public final void license(InterfaceC4407e interfaceC4407e) {
        interfaceC4407e.getClass();
        this.f4013e.license(interfaceC4407e);
        this.f4015e.add(interfaceC4407e);
        Signature(this.f4018e, interfaceC4407e);
        Signature(this.f4012e, interfaceC4407e);
        Signature(this.f4022e, interfaceC4407e);
        Signature(this.f4021e, interfaceC4407e);
        Signature(this.f4016e, interfaceC4407e);
        Signature(this.f4019e, interfaceC4407e);
        Signature(this.f4014e, interfaceC4407e);
    }

    @Override // defpackage.InterfaceC9660e
    public final Uri loadAd() {
        InterfaceC9660e interfaceC9660e = this.f4017e;
        if (interfaceC9660e == null) {
            return null;
        }
        return interfaceC9660e.loadAd();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [eٍۖؔ, eُؚْ, eَٖؐ] */
    /* JADX WARN: Type inference failed for: r0v7, types: [eٍۖؔ, eَٖؐ, eٌۣؔ] */
    @Override // defpackage.InterfaceC9660e
    public final long metrica(C2435e c2435e) {
        AbstractC2301e.subscription(this.f4017e == null);
        Uri uri = c2435e.ad;
        String scheme = uri.getScheme();
        String str = AbstractC9413e.ad;
        String scheme2 = uri.getScheme();
        boolean isEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.f4020e;
        if (isEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f4018e == null) {
                    ?? abstractC15896e = new AbstractC15896e(false);
                    this.f4018e = abstractC15896e;
                    mopub(abstractC15896e);
                }
                this.f4017e = this.f4018e;
            } else {
                if (this.f4012e == null) {
                    C7074e c7074e = new C7074e(context);
                    this.f4012e = c7074e;
                    mopub(c7074e);
                }
                this.f4017e = this.f4012e;
            }
        } else if ("asset".equals(scheme)) {
            if (this.f4012e == null) {
                C7074e c7074e2 = new C7074e(context);
                this.f4012e = c7074e2;
                mopub(c7074e2);
            }
            this.f4017e = this.f4012e;
        } else if ("content".equals(scheme)) {
            if (this.f4022e == null) {
                C0068e c0068e = new C0068e(context);
                this.f4022e = c0068e;
                mopub(c0068e);
            }
            this.f4017e = this.f4022e;
        } else {
            boolean equals = "rtmp".equals(scheme);
            InterfaceC9660e interfaceC9660e = this.f4013e;
            if (equals) {
                if (this.f4021e == null) {
                    try {
                        InterfaceC9660e interfaceC9660e2 = (InterfaceC9660e) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.f4021e = interfaceC9660e2;
                        mopub(interfaceC9660e2);
                    } catch (ClassNotFoundException unused) {
                        AbstractC2803e.smaato("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating RTMP extension", e);
                    }
                    if (this.f4021e == null) {
                        this.f4021e = interfaceC9660e;
                    }
                }
                this.f4017e = this.f4021e;
            } else if ("udp".equals(scheme)) {
                if (this.f4016e == null) {
                    C12584e c12584e = new C12584e();
                    this.f4016e = c12584e;
                    mopub(c12584e);
                }
                this.f4017e = this.f4016e;
            } else if ("data".equals(scheme)) {
                if (this.f4019e == null) {
                    ?? abstractC15896e2 = new AbstractC15896e(false);
                    this.f4019e = abstractC15896e2;
                    mopub(abstractC15896e2);
                }
                this.f4017e = this.f4019e;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.f4014e == null) {
                    C6300e c6300e = new C6300e(context);
                    this.f4014e = c6300e;
                    mopub(c6300e);
                }
                this.f4017e = this.f4014e;
            } else {
                this.f4017e = interfaceC9660e;
            }
        }
        return this.f4017e.metrica(c2435e);
    }

    public final void mopub(InterfaceC9660e interfaceC9660e) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4015e;
            if (i >= arrayList.size()) {
                return;
            }
            interfaceC9660e.license((InterfaceC4407e) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.InterfaceC15672e
    public final int read(byte[] bArr, int i, int i2) {
        InterfaceC9660e interfaceC9660e = this.f4017e;
        interfaceC9660e.getClass();
        return interfaceC9660e.read(bArr, i, i2);
    }
}
