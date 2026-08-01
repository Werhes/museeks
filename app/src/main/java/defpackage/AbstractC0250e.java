package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؑؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0250e {
    public static File ad;

    public static final void ad(InterfaceC12864e interfaceC12864e, AbstractC16904e abstractC16904e, final InterfaceC12123e interfaceC12123e, final EnumC17426e enumC17426e, C9708e c9708e, final boolean z, final C11644e c11644e, final float f, final InterfaceC13730e interfaceC13730e, InterfaceC14906e interfaceC14906e, final InterfaceC3886e interfaceC3886e, final C14544e c14544e, final InterfaceC4978e interfaceC4978e, final C2892e c2892e, C13770e c13770e, final int i, final int i2) {
        int i3;
        int i4;
        InterfaceC14906e interfaceC14906e2;
        C9708e c9708e2;
        InterfaceC12864e interfaceC12864e2;
        AbstractC16904e abstractC16904e2;
        Object c15479e;
        C13770e c13770e2;
        int i5;
        int i6;
        EnumC17426e enumC17426e2;
        InterfaceC18435e interfaceC18435e;
        InterfaceC9959e interfaceC9959e;
        InterfaceC12864e interfaceC12864e3;
        c13770e.m3671package(-572816025);
        if ((i & 6) == 0) {
            i3 = i | (c13770e.purchase(interfaceC12864e) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= c13770e.purchase(abstractC16904e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= c13770e.purchase(interfaceC12123e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= c13770e.billing(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= c13770e.license(enumC17426e.ordinal()) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= c13770e.purchase(c9708e) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= c13770e.billing(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= c13770e.purchase(c11644e) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= c13770e.license(0) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= c13770e.metrica(f) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (c13770e.purchase(interfaceC13730e) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= c13770e.yandex(interfaceC14906e) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= c13770e.yandex(null) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= c13770e.purchase(interfaceC3886e) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= c13770e.purchase(c14544e) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= c13770e.purchase(interfaceC4978e) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= c13770e.yandex(c2892e) ? 1048576 : 524288;
        }
        int i7 = i4;
        if (c13770e.m3673protected(i3 & 1, ((i3 & 306783379) == 306783378 && (599187 & i7) == 599186) ? false : true)) {
            int i8 = i3 & 112;
            boolean z2 = i8 == 32;
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (z2 || m3681throw == obj) {
                m3681throw = new C18414e(abstractC16904e, 0);
                c13770e.m3682throws(m3681throw);
            }
            Object obj2 = (Function0) m3681throw;
            int i9 = i3 >> 3;
            int i10 = i9 & 14;
            int i11 = i7 >> 15;
            int i12 = i10 | (i11 & 112) | (i7 & 896);
            Object mopub = AbstractC14533e.mopub(c2892e, c13770e);
            Object mopub2 = AbstractC14533e.mopub(null, c13770e);
            boolean purchase = ((((i12 & 14) ^ 6) > 4 && c13770e.purchase(abstractC16904e)) || (i12 & 6) == 4) | c13770e.purchase(mopub) | c13770e.purchase(mopub2) | c13770e.purchase(obj2);
            Object m3681throw2 = c13770e.m3681throw();
            if (purchase || m3681throw2 == obj) {
                C10990e c10990e = C10990e.f21769e;
                m3681throw2 = new C12781e(0, 5, InterfaceC16132e.class, AbstractC14533e.appmetrica(c10990e, new C5625e(AbstractC14533e.appmetrica(c10990e, new Csynchronized(13, mopub, mopub2, obj2)), abstractC16904e, 24)), "value", "getValue()Ljava/lang/Object;");
                c13770e.m3682throws(m3681throw2);
            }
            InterfaceC9959e interfaceC9959e2 = (InterfaceC9959e) m3681throw2;
            Object m3681throw3 = c13770e.m3681throw();
            if (m3681throw3 == obj) {
                m3681throw3 = AbstractC17680e.startapp(c13770e);
                c13770e.m3682throws(m3681throw3);
            }
            InterfaceC18435e interfaceC18435e2 = (InterfaceC18435e) m3681throw3;
            boolean z3 = i8 == 32;
            Object m3681throw4 = c13770e.m3681throw();
            if (z3 || m3681throw4 == obj) {
                m3681throw4 = new C18414e(abstractC16904e, 1);
                c13770e.m3682throws(m3681throw4);
            }
            Function0 function0 = (Function0) m3681throw4;
            int i13 = i3 >> 9;
            int i14 = (i3 & 65520) | (i13 & 458752) | (i13 & 3670016) | ((i7 << 21) & 29360128);
            int i15 = i7 << 15;
            int i16 = i14 | (i15 & 234881024) | (i15 & 1879048192);
            boolean purchase2 = ((((i16 & 234881024) ^ 100663296) > 67108864 && c13770e.purchase(interfaceC3886e)) || (i16 & 100663296) == 67108864) | ((((i16 & 112) ^ 48) > 32 && c13770e.purchase(abstractC16904e)) || (i16 & 48) == 32) | ((((i16 & 896) ^ 384) > 256 && c13770e.purchase(interfaceC12123e)) || (i16 & 384) == 256) | ((((i16 & 7168) ^ 3072) > 2048 && c13770e.billing(false)) || (i16 & 3072) == 2048) | ((((57344 & i16) ^ 24576) > 16384 && c13770e.license(enumC17426e.ordinal())) || (i16 & 24576) == 16384) | ((((i16 & 1879048192) ^ 805306368) > 536870912 && c13770e.purchase(c14544e)) || (i16 & 805306368) == 536870912) | ((((i16 & 3670016) ^ 1572864) > 1048576 && c13770e.metrica(f)) || (i16 & 1572864) == 1048576) | ((((i16 & 29360128) ^ 12582912) > 8388608 && c13770e.purchase(interfaceC13730e)) || (i16 & 12582912) == 8388608) | ((((i11 & 14) ^ 6) > 4 && c13770e.purchase(interfaceC4978e)) || (i11 & 6) == 4) | c13770e.purchase(function0) | ((((i16 & 458752) ^ 196608) > 131072 && c13770e.license(0)) || (i16 & 196608) == 131072) | c13770e.purchase(interfaceC18435e2);
            Object m3681throw5 = c13770e.m3681throw();
            if (purchase2 || m3681throw5 == obj) {
                c13770e2 = c13770e;
                i5 = i8;
                i6 = 4;
                enumC17426e2 = enumC17426e;
                c15479e = new C15479e(abstractC16904e, enumC17426e2, interfaceC12123e, f, interfaceC13730e, interfaceC9959e2, function0, c14544e, interfaceC3886e, interfaceC4978e, interfaceC18435e2);
                interfaceC18435e = interfaceC18435e2;
                interfaceC9959e = interfaceC9959e2;
                c13770e2.m3682throws(c15479e);
            } else {
                c13770e2 = c13770e;
                interfaceC18435e = interfaceC18435e2;
                i6 = 4;
                c15479e = m3681throw5;
                i5 = i8;
                interfaceC9959e = interfaceC9959e2;
                enumC17426e2 = enumC17426e;
            }
            InterfaceC14306e interfaceC14306e = (InterfaceC14306e) c15479e;
            EnumC17426e enumC17426e3 = EnumC17426e.f34146e;
            boolean z4 = enumC17426e2 == enumC17426e3;
            boolean billing = (((i10 ^ 6) > i6 && c13770e2.purchase(abstractC16904e)) || (i9 & 6) == i6) | c13770e2.billing(z4);
            Object m3681throw6 = c13770e2.m3681throw();
            if (billing || m3681throw6 == obj) {
                m3681throw6 = new C10646e(abstractC16904e, z4);
                c13770e2.m3682throws(m3681throw6);
            }
            InterfaceC5495e interfaceC5495e = (InterfaceC5495e) m3681throw6;
            boolean z5 = ((i3 & 458752) == 131072) | (i5 == 32);
            Object m3681throw7 = c13770e2.m3681throw();
            if (z5 || m3681throw7 == obj) {
                c9708e2 = c9708e;
                m3681throw7 = new C18028e(c9708e2, abstractC16904e);
                c13770e2.m3682throws(m3681throw7);
            } else {
                c9708e2 = c9708e;
            }
            C18028e c18028e = (C18028e) m3681throw7;
            InterfaceC13547e interfaceC13547e = (InterfaceC13547e) c13770e2.adcel(AbstractC11998e.ad);
            EnumC7792e enumC7792e = (EnumC7792e) c13770e2.adcel(AbstractC11473e.amazon);
            c13770e2.m3676strictfp(-853904960);
            boolean purchase3 = (i5 == 32) | c13770e2.purchase(interfaceC13547e) | c13770e2.license(enumC7792e.ordinal());
            Object m3681throw8 = c13770e2.m3681throw();
            if (purchase3 || m3681throw8 == obj) {
                m3681throw8 = new C17535e(abstractC16904e, interfaceC13547e, enumC7792e);
                c13770e2.m3682throws(m3681throw8);
            }
            C17535e c17535e = (C17535e) m3681throw8;
            c13770e2.Signature(false);
            C0115e c0115e = C0115e.f1276e;
            if (z) {
                c13770e2.m3676strictfp(-853484445);
                int i17 = i10 | ((i3 >> 21) & 112);
                boolean z6 = ((((i17 & 112) ^ 48) > 32 && c13770e2.license(0)) || (i17 & 48) == 32) | ((((i17 & 14) ^ 6) > 4 && c13770e2.purchase(abstractC16904e)) || (i17 & 6) == 4);
                Object m3681throw9 = c13770e2.m3681throw();
                if (z6 || m3681throw9 == obj) {
                    m3681throw9 = new C9651e(abstractC16904e);
                    c13770e2.m3682throws(m3681throw9);
                }
                interfaceC12864e3 = AbstractC6261e.license((C9651e) m3681throw9, abstractC16904e.tapsense, enumC17426e2);
                c13770e2.Signature(false);
            } else {
                c13770e2.m3676strictfp(-853054661);
                c13770e2.Signature(false);
                interfaceC12864e3 = c0115e;
            }
            interfaceC12864e2 = interfaceC12864e;
            InterfaceC12864e license = AbstractC2003e.license(interfaceC12864e2.premium(abstractC16904e.isPro).premium(abstractC16904e.isVip), interfaceC9959e, interfaceC5495e, enumC17426e2, z);
            InterfaceC12864e premium = z ? license.premium(AbstractC1147e.ad(c0115e, false, new C3778e(enumC17426e2 == enumC17426e3, abstractC16904e, interfaceC18435e, 0))) : license.premium(c0115e);
            abstractC16904e2 = abstractC16904e;
            interfaceC14906e2 = interfaceC14906e;
            AbstractC15118e.ad(interfaceC9959e, AbstractC14783e.license(AbstractC6227e.license(premium.premium(interfaceC12864e3), abstractC16904e, enumC17426e2, c11644e, z, c18028e, abstractC16904e.Signature, c17535e).premium(new C8128e(abstractC16904e, null, null, new C3169e(1, abstractC16904e), 6)), interfaceC14906e2, null), abstractC16904e2.pro, interfaceC14306e, c13770e, 0);
        } else {
            interfaceC14906e2 = interfaceC14906e;
            c9708e2 = c9708e;
            interfaceC12864e2 = interfaceC12864e;
            abstractC16904e2 = abstractC16904e;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            final C9708e c9708e3 = c9708e2;
            final InterfaceC14906e interfaceC14906e3 = interfaceC14906e2;
            final AbstractC16904e abstractC16904e3 = abstractC16904e2;
            final InterfaceC12864e interfaceC12864e4 = interfaceC12864e2;
            subscription.license = new Function2() { // from class: eُّؕ
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int advert = AbstractC5190e.advert(i | 1);
                    int advert2 = AbstractC5190e.advert(i2);
                    AbstractC0250e.ad(InterfaceC12864e.this, abstractC16904e3, interfaceC12123e, enumC17426e, c9708e3, z, c11644e, f, interfaceC13730e, interfaceC14906e3, interfaceC3886e, c14544e, interfaceC4978e, c2892e, (C13770e) obj3, advert, advert2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Charset appmetrica(InterfaceC18107e interfaceC18107e, Charset charset) {
        Iterator it = AbstractC13480e.m3577else(AbstractC16082e.vip(interfaceC18107e.mo459e("Accept-Charset")), new C11021e(26)).iterator();
        while (it.hasNext()) {
            String str = ((C16855e) it.next()).ad;
            if (AbstractC7890e.billing(str, "*")) {
                return charset;
            }
            Charset charset2 = AbstractC5508e.ad;
            if (Charset.isSupported(str)) {
                return Charset.forName(str);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object license(java.util.ArrayList r10, defpackage.InterfaceC13033e r11, defpackage.C12025e r12, java.nio.charset.Charset r13, defpackage.AbstractC10731e r14) {
        /*
            boolean r0 = r14 instanceof defpackage.C6665e
            if (r0 == 0) goto L13
            r0 = r14
            eؙؚۜ r0 = (defpackage.C6665e) r0
            int r1 = r0.f13757e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13757e = r1
            goto L18
        L13:
            eؙؚۜ r0 = new eؙؚۜ
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f13758e
            int r1 = r0.f13757e
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            eِ۟ۥ r12 = r0.f13755e
            eْٕؕ r11 = r0.f13756e
            defpackage.AbstractC2003e.purchase(r14)
            goto L5b
        L2a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L32:
            defpackage.AbstractC2003e.purchase(r14)
            eَٖٓ r5 = new eَٖٓ
            r14 = 3
            r5.<init>(r14, r10)
            eؙۙؕ r4 = new eؙۙؕ
            r9 = 0
            r8 = r11
            r7 = r12
            r6 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            eًۛۗ r10 = new eًۛۗ
            r11 = 0
            r10.<init>(r8, r3, r11)
            r0.f13756e = r8
            r0.f13755e = r7
            r0.f13757e = r2
            java.lang.Object r14 = defpackage.AbstractC7535e.advert(r4, r10, r0)
            eٟؔۙ r10 = defpackage.EnumC2821e.f6782e
            if (r14 != r10) goto L59
            return r10
        L59:
            r12 = r7
            r11 = r8
        L5b:
            if (r14 != 0) goto L86
            boolean r10 = r11.yandex()
            if (r10 != 0) goto L64
            return r11
        L64:
            eٓٔۖ r10 = r12.vip
            if (r10 == 0) goto L71
            boolean r10 = r10.startapp()
            if (r10 != r2) goto L71
            eِٖۨ r10 = defpackage.C16676e.ad
            return r10
        L71:
            eًؓ۟ r10 = new eًؓ۟
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r13 = "No suitable converter found for "
            r11.<init>(r13)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r12 = 2
            r10.<init>(r12, r11, r3)
            throw r10
        L86:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC0250e.license(java.util.ArrayList, eْٕؕ, eِ۟ۥ, java.nio.charset.Charset, eُؑ۠):java.lang.Object");
    }

    public static final C6071e metrica(C13915e c13915e, boolean z) {
        AbstractC13616e abstractC13616e = (AbstractC13616e) c13915e.f27592e.billing;
        InterfaceC5077e interfaceC5077e = null;
        if ((abstractC13616e.f27020e & 8) != 0) {
            loop0: while (true) {
                if (abstractC13616e == null) {
                    break;
                }
                if ((abstractC13616e.f27014e & 8) != 0) {
                    AbstractC13616e abstractC13616e2 = abstractC13616e;
                    C12431e c12431e = null;
                    while (abstractC13616e2 != null) {
                        if (abstractC13616e2 instanceof InterfaceC17453e) {
                            interfaceC5077e = abstractC13616e2;
                            break loop0;
                        }
                        if ((abstractC13616e2.f27014e & 8) != 0 && (abstractC13616e2 instanceof AbstractC6126e)) {
                            int i = 0;
                            for (AbstractC13616e abstractC13616e3 = ((AbstractC6126e) abstractC13616e2).f12873e; abstractC13616e3 != null; abstractC13616e3 = abstractC13616e3.f27024e) {
                                if ((abstractC13616e3.f27014e & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        abstractC13616e2 = abstractC13616e3;
                                    } else {
                                        if (c12431e == null) {
                                            c12431e = new C12431e(0, new AbstractC13616e[16]);
                                        }
                                        if (abstractC13616e2 != null) {
                                            c12431e.license(abstractC13616e2);
                                            abstractC13616e2 = null;
                                        }
                                        c12431e.license(abstractC13616e3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        abstractC13616e2 = AbstractC5851e.vip(c12431e);
                    }
                }
                if ((abstractC13616e.f27020e & 8) == 0) {
                    break;
                }
                abstractC13616e = abstractC13616e.f27024e;
            }
        }
        AbstractC13616e abstractC13616e4 = ((AbstractC13616e) ((InterfaceC17453e) interfaceC5077e)).f27022e;
        C0500e inmobi = c13915e.inmobi();
        if (inmobi == null) {
            inmobi = new C0500e();
        }
        return new C6071e(abstractC13616e4, z, c13915e, inmobi);
    }

    public static C2180e purchase(Context context, C7210e c7210e) {
        long j = c7210e.f14730e;
        int i = c7210e.f14725e;
        if (i == 1) {
            C9505e c9505e = c7210e.f14727e;
            byte[] bArr = c9505e != null ? c9505e.f18859e : c7210e.f14722e;
            if (bArr != null) {
                return new C2180e(j, 1, bArr, null, null);
            }
            throw new NullPointerException("Payload bytes cannot be null if type is BYTES.");
        }
        if (i != 2) {
            if (i != 3) {
                Log.w("NearbyConnections", String.format("Incoming ParcelablePayload %d has unknown type %d", Long.valueOf(j), Integer.valueOf(c7210e.f14725e)));
                return null;
            }
            ParcelFileDescriptor parcelFileDescriptor = c7210e.f14728e;
            if (parcelFileDescriptor != null) {
                return new C2180e(j, 3, null, null, new C3168e(parcelFileDescriptor));
            }
            throw new NullPointerException("Data ParcelFileDescriptor cannot be null for type STREAM");
        }
        String str = c7210e.f14719e;
        Uri uri = c7210e.f14726e;
        if (str == null || uri == null) {
            if (uri != null && c7210e.f14728e == null) {
                Log.d("NearbyConnections", "Created file payload based on uri instead pfd");
                return C2180e.metrica(new C16389e((File) null, (ParcelFileDescriptor) null, c7210e.f14721e, uri), j);
            }
            ParcelFileDescriptor parcelFileDescriptor2 = c7210e.f14728e;
            if (parcelFileDescriptor2 != null) {
                return C2180e.metrica(new C16389e((File) null, parcelFileDescriptor2, parcelFileDescriptor2.getStatSize(), (Uri) null), j);
            }
            throw new NullPointerException("Data ParcelFileDescriptor cannot be null for type FILE");
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
            if (openFileDescriptor == null) {
                Log.w("NearbyConnections", String.format("Failed to get ParcelFileDescriptor for %s", uri));
                return null;
            }
            int i2 = AbstractC0539e.ad;
            C2180e metrica = C2180e.metrica(new C16389e(new File(str), openFileDescriptor, c7210e.f14732e, uri), j);
            if (!TextUtils.isEmpty(c7210e.f14724e)) {
                metrica.vip(c7210e.f14724e);
            }
            if (!TextUtils.isEmpty(c7210e.f14720e)) {
                metrica.ad(c7210e.f14720e);
            }
            return metrica;
        } catch (FileNotFoundException e) {
            Log.w("NearbyConnections", String.format("Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s.", uri, str), e);
            return null;
        } catch (SecurityException e2) {
            Log.w("NearbyConnections", String.format("Failed to create Payload from ParcelablePayload: unable to open uri %s for file %s.", uri, str), e2);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v22 */
    public static final void vip(final String str, InterfaceC12864e interfaceC12864e, final Function0 function0, final Function0 function02, final long j, C13770e c13770e, final int i) {
        final InterfaceC12864e interfaceC12864e2;
        InterfaceC12864e interfaceC12864e3;
        InterfaceC12864e interfaceC12864e4;
        Object obj;
        ?? r2;
        boolean z;
        c13770e.m3671package(-2078815310);
        int i2 = i | (c13770e.purchase(str) ? 4 : 2) | 48 | (c13770e.yandex(function0) ? 256 : 128) | (c13770e.yandex(function02) ? 2048 : 1024) | (c13770e.appmetrica(j) ? 16384 : 8192);
        if (c13770e.m3673protected(i2 & 1, (i2 & 9363) != 9362)) {
            c13770e.m3655case();
            int i3 = i & 1;
            InterfaceC12864e interfaceC12864e5 = C0115e.f1276e;
            if (i3 == 0 || c13770e.isPro()) {
                interfaceC12864e3 = interfaceC12864e5;
            } else {
                c13770e.m3659default();
                interfaceC12864e3 = interfaceC12864e;
            }
            c13770e.admob();
            if (j != 16) {
                c13770e.m3676strictfp(-853219337);
                Object obj2 = C2987e.ad;
                if (function0 != null) {
                    c13770e.m3676strictfp(-853120974);
                    int i4 = i2 & 896;
                    boolean z2 = i4 == 256;
                    Object m3681throw = c13770e.m3681throw();
                    if (z2 || m3681throw == obj2) {
                        m3681throw = new C3169e(3, function0);
                        c13770e.m3682throws(m3681throw);
                    }
                    interfaceC12864e4 = interfaceC12864e3;
                    C8128e c8128e = new C8128e(function0, null, null, (PointerInputEventHandler) m3681throw, 6);
                    boolean z3 = (i4 == 256) | ((i2 & 14) == 4);
                    Object m3681throw2 = c13770e.m3681throw();
                    obj = obj2;
                    if (z3 || m3681throw2 == obj) {
                        m3681throw2 = new C6538e(str, function0, 4);
                        c13770e.m3682throws(m3681throw2);
                    }
                    z = true;
                    interfaceC12864e5 = AbstractC1147e.ad(c8128e, true, (Function1) m3681throw2);
                    r2 = 0;
                    c13770e.Signature(false);
                } else {
                    interfaceC12864e4 = interfaceC12864e3;
                    obj = obj2;
                    r2 = 0;
                    z = true;
                    c13770e.m3676strictfp(-852623672);
                    c13770e.Signature(false);
                }
                InterfaceC12864e premium = interfaceC12864e4.premium(AbstractC18007e.metrica).premium(interfaceC12864e5);
                boolean z4 = ((((57344 & i2) ^ 24576) <= 16384 || !c13770e.appmetrica(j)) && (i2 & 24576) != 16384) ? r2 : z;
                if ((i2 & 7168) != 2048) {
                    z = r2;
                }
                boolean z5 = z4 | z;
                Object m3681throw3 = c13770e.m3681throw();
                if (z5 || m3681throw3 == obj) {
                    m3681throw3 = new C0967e(j, function02, 2);
                    c13770e.m3682throws(m3681throw3);
                }
                AbstractC18366e.ad(premium, (Function1) m3681throw3, c13770e, r2);
                c13770e.Signature(r2);
            } else {
                interfaceC12864e4 = interfaceC12864e3;
                c13770e.m3676strictfp(-852426512);
                c13770e.Signature(false);
            }
            interfaceC12864e2 = interfaceC12864e4;
        } else {
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new Function2(str, interfaceC12864e2, function0, function02, j, i) { // from class: eٖؒۘ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ long f3974e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ Function0 f3975e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12864e f3976e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ Function0 f3977e;

                /* renamed from: eّٖۦ, reason: contains not printable characters */
                public final /* synthetic */ String f3978e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int advert = AbstractC5190e.advert(1);
                    AbstractC0250e.vip(this.f3978e, this.f3976e, this.f3975e, this.f3977e, this.f3974e, (C13770e) obj3, advert);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
