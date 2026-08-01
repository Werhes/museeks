package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.util.UUID;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ۟۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16542e extends AbstractC6762e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC6484e f32432e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f32433e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f32434e;

    public /* synthetic */ C16542e(AbstractC6484e abstractC6484e, Object obj, int i) {
        this.f32433e = i;
        this.f32432e = abstractC6484e;
        this.f32434e = obj;
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, eًؓٛ] */
    @Override // defpackage.InterfaceC10801e
    public final void ad(Object obj) {
        InterfaceC3851e interfaceC3851e;
        int i = this.f32433e;
        Object obj2 = this.f32434e;
        AbstractC6484e abstractC6484e = this.f32432e;
        switch (i) {
            case 0:
                ((AbstractC1346e) obj).metrica(((C2186e) abstractC6484e).f5554e, new C12916e(8, (Status) obj2));
                return;
            default:
                C17157e c17157e = (C17157e) obj;
                String str = ((C7668e) abstractC6484e).f15584e;
                C2180e c2180e = (C2180e) obj2;
                int i2 = c17157e.ad;
                AbstractC10347e abstractC10347e = c17157e.vip;
                switch (i2) {
                    case 0:
                        C3409e c3409e = (C3409e) abstractC10347e;
                        int i3 = c2180e.vip;
                        if (i3 != 1) {
                            if (i3 == 3) {
                                c3409e.m1357synchronized(C11599e.ad);
                                C16529e c16529e = c3409e.f7624e;
                                long j = c2180e.ad;
                                VKXApplication vKXApplication = VKXApplication.f36528e;
                                if (vKXApplication == null) {
                                    vKXApplication = null;
                                }
                                C15420e c15420e = AbstractC6731e.ad;
                                c16529e.yandex(j, AbstractC5336e.purchase(vKXApplication, ExecutorC3603e.f8134e, 0, new C18210e(c2180e, c3409e, str, null), 2));
                                return;
                            }
                            return;
                        }
                        C18382e c18382e = AbstractC0852e.ad;
                        byte[] bArr = c2180e.metrica;
                        if (bArr == null) {
                            return;
                        }
                        c18382e.getClass();
                        InterfaceC16805e interfaceC16805e = (InterfaceC16805e) c18382e.vip(InterfaceC16805e.Companion.serializer(), bArr);
                        if (!(interfaceC16805e instanceof C11396e)) {
                            throw new C14803e(10);
                        }
                        C11396e c11396e = (C11396e) interfaceC16805e;
                        String str2 = c11396e.vip;
                        if (c11396e.ad != 99167 || !AbstractC7890e.billing(str2, "8.12.1_pub")) {
                            c3409e.m1357synchronized(new C11884e(str2));
                            c3409e.m1353instanceof(str, new C10265e());
                            return;
                        }
                        C5363e c5363e = AbstractC16696e.ad;
                        AbstractC16696e purchase = AbstractC16268e.purchase();
                        C6571e ads = purchase instanceof C17770e ? AbstractC11815e.ads(c3409e.pro(), ((C17770e) purchase).vip().getAbsolutePath()) : AbstractC11815e.subs(c3409e.pro());
                        Object obj3 = ads.f13543e;
                        Object obj4 = ads.f13544e;
                        long j2 = c11396e.license + 536870912;
                        boolean booleanValue = ((Boolean) ((C14688e) AbstractC1831e.ad().purchase.yandex).f29092e.getValue()).booleanValue();
                        Number number = (Number) obj4;
                        if (number.longValue() - j2 <= 0 || !booleanValue) {
                            Number number2 = (Number) obj3;
                            c3409e.m1357synchronized(new C12604e(number.longValue(), number2.longValue(), j2));
                            c3409e.m1353instanceof(str, new C0644e(number2.longValue(), number.longValue(), j2));
                            return;
                        }
                        C18511e c18511e = AbstractC11062e.f21949e;
                        String str3 = C10675e.f21023e;
                        c18511e.Signature(C10215e.purchase(purchase.metrica()));
                        purchase.metrica().mkdirs();
                        c3409e.f7621e.startapp(0);
                        c3409e.f7625e.startapp(c11396e.metrica);
                        c3409e.m1353instanceof(str, C5987e.INSTANCE);
                        return;
                    default:
                        C1963e c1963e = (C1963e) abstractC10347e;
                        if (c2180e.vip == 1) {
                            C18382e c18382e2 = AbstractC0852e.ad;
                            byte[] bArr2 = c2180e.metrica;
                            if (bArr2 == null) {
                                return;
                            }
                            c18382e2.getClass();
                            InterfaceC5353e interfaceC5353e = (InterfaceC5353e) c18382e2.vip(InterfaceC5353e.Companion.serializer(), bArr2);
                            if (AbstractC7890e.billing(interfaceC5353e, C5987e.INSTANCE)) {
                                String str4 = C10675e.f21023e;
                                C5363e c5363e2 = AbstractC16696e.ad;
                                C10675e purchase2 = C10215e.purchase(AbstractC16268e.purchase().vip());
                                ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                                ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                                C9674e c9674e = new C9674e(new C4122e(autoCloseOutputStream, new Object()));
                                C18511e c18511e2 = AbstractC11062e.f21949e;
                                AbstractC14966e.ad("CdcmSnd", 3, "[initiateTransferAfterHandshake] from " + purchase2, null);
                                c1963e.m735import(C4192e.ad);
                                C8130e m739transient = c1963e.m739transient();
                                C0473e c0473e = C2180e.startapp;
                                AbstractC9528e.adcel(parcelFileDescriptor, "Cannot create Payload.Stream from null ParcelFileDescriptor.");
                                m739transient.yandex(str, new C2180e(UUID.randomUUID().getLeastSignificantBits(), 3, null, null, new C3168e(parcelFileDescriptor)));
                                VKXApplication vKXApplication2 = VKXApplication.f36528e;
                                VKXApplication vKXApplication3 = vKXApplication2 != null ? vKXApplication2 : null;
                                C15420e c15420e2 = AbstractC6731e.ad;
                                c1963e.f5155e = AbstractC5336e.purchase(vKXApplication3, ExecutorC3603e.f8134e, 0, new C13455e(c9674e, autoCloseOutputStream, c18511e2, purchase2, c1963e, null), 2);
                                return;
                            }
                            if (interfaceC5353e instanceof C0644e) {
                                c1963e.m735import(C8520e.ad);
                                C8130e m739transient2 = c1963e.m739transient();
                                m739transient2.getClass();
                                C14911e c14911e = new C14911e(str, 6);
                                C9321e ad = C0381e.ad();
                                ad.appmetrica = 1229;
                                ad.ad = new C14240e(c14911e);
                                m739transient2.appmetrica(1, ad.ad());
                                m739transient2.mopub(str);
                                return;
                            }
                            if (interfaceC5353e instanceof C10265e) {
                                c1963e.m735import(new C11536e(((C10265e) interfaceC5353e).ad));
                                C8130e m739transient3 = c1963e.m739transient();
                                m739transient3.getClass();
                                C14911e c14911e2 = new C14911e(str, 6);
                                C9321e ad2 = C0381e.ad();
                                ad2.appmetrica = 1229;
                                ad2.ad = new C14240e(c14911e2);
                                m739transient3.appmetrica(1, ad2.ad());
                                m739transient3.mopub(str);
                                return;
                            }
                            if (!(interfaceC5353e instanceof C3106e)) {
                                throw new C14803e(10);
                            }
                            int ordinal = ((C3106e) interfaceC5353e).ad.ordinal();
                            if (ordinal == 0) {
                                interfaceC3851e = C3902e.ad;
                            } else if (ordinal == 1) {
                                interfaceC3851e = new C9827e(3);
                            } else {
                                if (ordinal != 2) {
                                    throw new C14803e(10);
                                }
                                interfaceC3851e = new C9827e(4);
                            }
                            c1963e.m735import(interfaceC3851e);
                            C8130e m739transient4 = c1963e.m739transient();
                            m739transient4.getClass();
                            C14911e c14911e3 = new C14911e(str, 6);
                            C9321e ad3 = C0381e.ad();
                            ad3.appmetrica = 1229;
                            ad3.ad = new C14240e(c14911e3);
                            m739transient4.appmetrica(1, ad3.ad());
                            m739transient4.mopub(str);
                            return;
                        }
                        return;
                }
        }
    }
}
