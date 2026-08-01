package defpackage;

import android.os.Bundle;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.common.api.Status;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NotificationCallback;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.PSKKeyManager;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٝۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0444e implements InterfaceC14746e, InterfaceC5369e, InterfaceC6610e, InterfaceC15269e, InterfaceC17091e, InterfaceC14309e, InterfaceC17145e, NotificationCallback, InterfaceC14187e, InterfaceC17342e, InterfaceC1133e, InterfaceC2581e, InterfaceC13838e, InterfaceC10846e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C14371e f2490e = new C14371e(1);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object f2491e;

    /* JADX WARN: Type inference failed for: r6v6, types: [eؘؚٝ, java.lang.Object] */
    public C0444e(int i) {
        InterfaceC5007e interfaceC5007e;
        switch (i) {
            case 3:
                this.f2491e = new AtomicInteger(0);
                return;
            case 5:
                C4069e license = C4069e.license();
                this.f2491e = license;
                C14326e c14326e = InterfaceC7775e.f15760e;
                Class cls = (Class) license.smaato(c14326e, null);
                if (cls != null && !cls.equals(C13945e.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                license.yandex(c14326e, C13945e.class);
                C14326e c14326e2 = InterfaceC7775e.f15761e;
                if (license.smaato(c14326e2, null) == null) {
                    license.yandex(c14326e2, C13945e.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 14:
                this.f2491e = new LinkedHashSet();
                return;
            case 23:
                this.f2491e = new C7249e(9);
                return;
            default:
                C10051e c10051e = C10051e.metrica;
                try {
                    interfaceC5007e = (InterfaceC5007e) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    interfaceC5007e = f2490e;
                }
                InterfaceC5007e[] interfaceC5007eArr = {C14371e.vip, interfaceC5007e};
                ?? obj = new Object();
                obj.ad = interfaceC5007eArr;
                Charset charset = AbstractC10546e.ad;
                this.f2491e = obj;
                return;
        }
    }

    public /* synthetic */ C0444e(Object obj) {
        this.f2491e = obj;
    }

    @Override // defpackage.InterfaceC5369e
    public Object Signature(C14887e c14887e, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        C8746e c8746e = (C8746e) this.f2491e;
        c8746e.getClass();
        C12816e c12816e = c14887e.f29498e;
        sb.append(c8746e.m2482goto("package"));
        String loadAd = c8746e.loadAd(AbstractC10681e.startapp(C13579e.purchase(c12816e.ad)));
        if (loadAd.length() > 0) {
            sb.append(" ");
            sb.append(loadAd);
        }
        if (c8746e.ad.amazon()) {
            sb.append(" in context of ");
            c8746e.m2491protected(c14887e.f29500e, sb, false);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC17145e
    public void ad() {
        ((C7838e) this.f2491e).f15864e = null;
    }

    @Override // defpackage.InterfaceC17145e
    public /* synthetic */ void adcel() {
    }

    @Override // defpackage.InterfaceC5369e
    public Object admob(C14457e c14457e, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        C8746e c8746e = (C8746e) this.f2491e;
        c8746e.getClass();
        c8746e.inmobi(sb, c14457e, null);
        c8746e.m2492static(c14457e.f28581e, sb);
        c8746e.m2487native(c14457e, sb);
        sb.append(c8746e.m2482goto("typealias"));
        sb.append(" ");
        c8746e.m2491protected(c14457e, sb, true);
        List list = c14457e.f28578e;
        if (list == null) {
            list = null;
        }
        c8746e.m2489package(sb, list, false);
        c8746e.applovin(c14457e, sb);
        sb.append(" = ");
        AbstractC10226e abstractC10226e = c14457e.f28576e;
        sb.append(c8746e.m2481final(abstractC10226e != null ? abstractC10226e : null));
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC5369e
    public /* bridge */ /* synthetic */ Object ads(InterfaceC16528e interfaceC16528e, Object obj) {
        m349extends(interfaceC16528e, (StringBuilder) obj);
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC17145e
    public C13747e advert(C12318e c12318e, C11858e c11858e, Bundle bundle) {
        return AbstractC2017e.license(new C9759e(-6));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // defpackage.InterfaceC1133e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable amazon(defpackage.AbstractC10731e r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.C18335e
            if (r0 == 0) goto L13
            r0 = r7
            eۙ r0 = (defpackage.C18335e) r0
            int r1 = r0.f35997e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35997e = r1
            goto L18
        L13:
            eۙ r0 = new eۙ
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f36000e
            int r1 = r0.f35997e
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            eؒٛؕ r1 = r0.f35996e
            eؒٛؕ r0 = r0.f35998e
            defpackage.AbstractC2003e.purchase(r7)
            goto L50
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            defpackage.AbstractC2003e.purchase(r7)
            eؒٛؕ r1 = defpackage.AbstractC6874e.license()
            int r7 = defpackage.C13552e.f26851e
            java.lang.Object r7 = r6.f2491e
            ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist r7 = (ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist) r7
            java.lang.String r7 = r7.ad
            r0.f35998e = r1
            r0.f35996e = r1
            r0.f35997e = r2
            java.lang.Object r7 = defpackage.C10068e.metrica(r7, r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r7 != r0) goto L4f
            return r0
        L4f:
            r0 = r1
        L50:
            bruhcollective.itaysonlab.libvkmusic.methods.uma.UmaSearch$Preapi r7 = (bruhcollective.itaysonlab.libvkmusic.methods.uma.UmaSearch$Preapi) r7
            java.util.List r7 = r7.license
            java.lang.Object r7 = defpackage.AbstractC13480e.m3604this(r7)
            bruhcollective.itaysonlab.libvkmusic.objects.UmaArtist r7 = (bruhcollective.itaysonlab.libvkmusic.objects.UmaArtist) r7
            if (r7 != 0) goto L5d
            goto L6e
        L5d:
            eؚٕۢ r2 = new eؚٕۢ
            java.lang.String r3 = r7.vip
            long r4 = r7.metrica
            java.lang.String r7 = java.lang.String.valueOf(r4)
            r4 = 5
            r2.<init>(r3, r4, r7)
            r1.add(r2)
        L6e:
            eؒٛؕ r7 = defpackage.AbstractC6874e.metrica(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0444e.amazon(eُؑ۠):java.io.Serializable");
    }

    @Override // defpackage.InterfaceC17145e
    public /* synthetic */ void applovin() {
    }

    @Override // defpackage.InterfaceC6610e
    /* renamed from: appmetrica */
    public C17424e mo3419appmetrica() {
        C17565e c17565e = new C17565e((SecureRandom) this.f2491e);
        return new C17424e(c17565e.ad(), c17565e, false, 5);
    }

    @Override // defpackage.InterfaceC5369e
    public Object billing(AbstractC17288e abstractC17288e, Object obj) {
        ((C8746e) this.f2491e).m2493strictfp(abstractC17288e, (StringBuilder) obj, true);
        return Unit.INSTANCE;
    }

    /* renamed from: break, reason: not valid java name */
    public void m347break(long j) {
        InterfaceC11855e interfaceC11855e = (InterfaceC11855e) this.f2491e;
        while (((-128) & j) != 0) {
            interfaceC11855e.writeByte((((int) j) & 127) | 128);
            j >>>= 7;
        }
        interfaceC11855e.writeByte((int) j);
    }

    @Override // defpackage.InterfaceC5369e
    /* renamed from: class, reason: not valid java name */
    public Object mo348class(C7283e c7283e, Object obj) {
        C7283e mo1722e;
        boolean z = c7283e.f14891e;
        StringBuilder sb = (StringBuilder) obj;
        C8746e c8746e = (C8746e) this.f2491e;
        c8746e.getClass();
        c8746e.inmobi(sb, c7283e, null);
        C17127e c17127e = c8746e.ad;
        C1577e c1577e = c17127e.loadAd;
        InterfaceC8614e[] interfaceC8614eArr = C17127e.f33518strictfp;
        InterfaceC8614e interfaceC8614e = interfaceC8614eArr[13];
        boolean z2 = (((Boolean) c1577e.ad).booleanValue() || c7283e.mo2283e().mo1718extends() != 2) && c8746e.m2492static(c7283e.advert(), sb);
        c8746e.m2496this(c7283e, sb);
        C1577e c1577e2 = c17127e.f33520break;
        InterfaceC8614e interfaceC8614e2 = interfaceC8614eArr[40];
        boolean z3 = ((Boolean) c1577e2.ad).booleanValue() || !z || z2;
        if (z3) {
            sb.append(c8746e.m2482goto("constructor"));
        }
        InterfaceC5052e mo1351switch = c7283e.mo1351switch();
        C1577e c1577e3 = c17127e.ads;
        InterfaceC8614e interfaceC8614e3 = interfaceC8614eArr[25];
        if (((Boolean) c1577e3.ad).booleanValue()) {
            if (z3) {
                sb.append(" ");
            }
            c8746e.m2491protected(mo1351switch, sb, true);
            c8746e.m2489package(sb, c7283e.getTypeParameters(), false);
        }
        c8746e.m2485instanceof(sb, c7283e.mo330e(), c7283e.mo328e());
        C1577e c1577e4 = c17127e.admob;
        InterfaceC8614e interfaceC8614e4 = interfaceC8614eArr[15];
        if (((Boolean) c1577e4.ad).booleanValue() && !z && AbstractC0869e.premium(mo1351switch) && (mo1722e = mo1351switch.mo1722e()) != null) {
            List mo330e = mo1722e.mo330e();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : mo330e) {
                C13043e c13043e = (C13043e) obj2;
                if (!c13043e.m3525e() && c13043e.f25971e == null) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                sb.append(" : ");
                sb.append(c8746e.m2482goto("this"));
                sb.append(AbstractC13480e.m3608try(arrayList, ", ", "(", ")", C7247e.f14818e, 24));
            }
        }
        C1577e c1577e5 = c17127e.ads;
        InterfaceC8614e interfaceC8614e5 = C17127e.f33518strictfp[25];
        if (((Boolean) c1577e5.ad).booleanValue()) {
            c8746e.m2495synchronized(sb, c7283e.getTypeParameters());
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC14746e
    public void crashlytics(Bundle bundle) {
        ((C8638e) ((InterfaceC5632e) this.f2491e)).ad("clx", "_ae", bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        if (((java.lang.Boolean) r3.ad).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:
    
        if (((java.lang.Boolean) r2.ad).booleanValue() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0197, code lost:
    
        if (defpackage.AbstractC13270e.crashlytics(r2, defpackage.AbstractC0206e.license) == false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* renamed from: extends, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m349extends(defpackage.InterfaceC16528e r11, java.lang.StringBuilder r12) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0444e.m349extends(eٖ۟ؖ, java.lang.StringBuilder):void");
    }

    @Override // defpackage.InterfaceC13838e
    public int firebase() {
        return ((InterfaceC13838e) this.f2491e).firebase() * 2;
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        return new C15176e((InterfaceC7970e) ((C15816e) this.f2491e).f31190e);
    }

    @Override // defpackage.InterfaceC17342e
    /* renamed from: goto, reason: not valid java name */
    public void mo350goto(long[] jArr) {
        long[][] jArr2 = (long[][]) this.f2491e;
        if (jArr2 == null) {
            this.f2491e = (long[][]) Array.newInstance((Class<?>) Long.TYPE, PSKKeyManager.MAX_KEY_LENGTH_BYTES, 4);
        } else {
            long[] jArr3 = jArr2[1];
            if (((jArr[0] ^ jArr3[0]) | (jArr[1] ^ jArr3[1]) | (jArr[2] ^ jArr3[2]) | (jArr[3] ^ jArr3[3])) == 0) {
                return;
            }
        }
        AbstractC12447e.license(jArr, ((long[][]) this.f2491e)[1]);
        for (int i = 2; i < 256; i += 2) {
            long[][] jArr4 = (long[][]) this.f2491e;
            long[] jArr5 = jArr4[i >> 1];
            long[] jArr6 = jArr4[i];
            long j = jArr5[0];
            long j2 = jArr5[1];
            long j3 = jArr5[2];
            long j4 = jArr5[3];
            jArr6[0] = (j << 1) ^ ((j4 >> 63) & 1061);
            jArr6[1] = (j2 << 1) | (j >>> 63);
            jArr6[2] = (j3 << 1) | (j2 >>> 63);
            jArr6[3] = (j4 << 1) | (j3 >>> 63);
            AbstractC12447e.ad(jArr6, jArr4[1], jArr4[i + 1]);
        }
    }

    @Override // defpackage.InterfaceC13838e
    public void init(InterfaceC3894e interfaceC3894e) {
        throw null;
    }

    @Override // defpackage.InterfaceC14187e
    public void inmobi(IOException iOException) {
        ((C2342e) ((C13935e) this.f2491e).f27641e).billing(Boolean.FALSE);
    }

    /* renamed from: interface, reason: not valid java name */
    public boolean m351interface(int i) {
        if (i < 0) {
            return false;
        }
        Csuper csuper = (Csuper) this.f2491e;
        if (i >= csuper.f36470e) {
            return false;
        }
        C4763e tapsense = csuper.tapsense(i);
        Function1 function1 = ((C6967e) tapsense.metrica).metrica;
        return function1 != null && function1.invoke(Integer.valueOf(i - tapsense.ad)) == C14914e.f29572e;
    }

    @Override // defpackage.InterfaceC5369e
    public Object isPro(C10162e c10162e, Object obj) {
        C8746e.amazon((C8746e) this.f2491e, c10162e, (StringBuilder) obj);
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC13838e
    public void isVip(InterfaceC3894e interfaceC3894e, byte[] bArr, int i) {
        AbstractC1786e.applovin(interfaceC3894e);
        throw null;
    }

    @Override // defpackage.InterfaceC14309e
    public void license(Object obj) {
        ((C0485e) this.f2491e).smaato(((C7637e) obj).ad);
    }

    @Override // defpackage.InterfaceC6610e
    public void loadAd(C13572e c13572e) {
        this.f2491e = (SecureRandom) c13572e.f26878e;
        ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
    }

    @Override // defpackage.InterfaceC5369e
    public Object metrica(C13043e c13043e, Object obj) {
        ((C8746e) this.f2491e).m2484import(c13043e, true, (StringBuilder) obj, true);
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC10846e
    public void mopub(String str, long j, long j2, long j3) {
        AbstractC18345e abstractC18345e = (AbstractC18345e) this.f2491e;
        try {
            abstractC18345e.adcel(new C18444e(abstractC18345e, new Status(2103, null, null, null)));
        } catch (IllegalStateException e) {
            C18482e c18482e = C5710e.adcel;
            Log.e(c18482e.ad, c18482e.license("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = abstractC18345e.signatures.yandex.iterator();
        while (it.hasNext()) {
            ((C8327e) it.next()).appmetrica(str, j, 2103, j2, j3);
        }
    }

    /* renamed from: native, reason: not valid java name */
    public int m352native(int i) {
        int m354this;
        synchronized (C0444e.class) {
            m354this = m354this("next_job_scheduler_id");
            if (m354this < 0 || m354this > i) {
                ((WorkDatabase) this.f2491e).adcel().tapsense(new C12377e(1, "next_job_scheduler_id"));
                m354this = 0;
            }
        }
        return m354this;
    }

    @Override // io.realm.kotlin.internal.interop.NotificationCallback
    public void onChange(long j) {
        C0912e c0912e = (C0912e) this.f2491e;
        int i = AbstractC6026e.ad;
        c0912e.smaato(new LongPointerWrapper(realmcJNI.realm_clone(j), true));
    }

    @Override // defpackage.InterfaceC5369e
    public Object premium(AbstractC17645e abstractC17645e, Object obj) {
        C7283e mo1722e;
        String str;
        StringBuilder sb = (StringBuilder) obj;
        C8746e c8746e = (C8746e) this.f2491e;
        C17127e c17127e = c8746e.ad;
        boolean z = abstractC17645e.mo1724e() == 4;
        if (!c8746e.admob()) {
            c8746e.premium(sb, abstractC17645e.mo1725e());
            c8746e.inmobi(sb, abstractC17645e, null);
            if (!z) {
                c8746e.m2492static(abstractC17645e.advert(), sb);
            }
            if ((abstractC17645e.mo1724e() != 2 || abstractC17645e.mo1718extends() != 4) && (!AbstractC17861e.vip(abstractC17645e.mo1724e()) || abstractC17645e.mo1718extends() != 1)) {
                c8746e.m2480extends(abstractC17645e.mo1718extends(), C8746e.signatures(abstractC17645e), sb);
            }
            c8746e.m2487native(abstractC17645e, sb);
            c8746e.m2500while(sb, c8746e.Signature().contains(EnumC7095e.INNER) && abstractC17645e.mo1222instanceof(), "inner");
            c8746e.m2500while(sb, c8746e.Signature().contains(EnumC7095e.DATA) && abstractC17645e.mo1720e(), "data");
            c8746e.m2500while(sb, c8746e.Signature().contains(EnumC7095e.INLINE) && abstractC17645e.yandex(), "inline");
            c8746e.m2500while(sb, c8746e.Signature().contains(EnumC7095e.VALUE) && abstractC17645e.mo1731private(), "value");
            c8746e.m2500while(sb, c8746e.Signature().contains(EnumC7095e.FUN) && abstractC17645e.mo1729e(), "fun");
            if (abstractC17645e instanceof InterfaceC9794e) {
                str = "typealias";
            } else if (abstractC17645e.mo1723e()) {
                str = "companion object";
            } else {
                int m2467class = AbstractC8703e.m2467class(abstractC17645e.mo1724e());
                if (m2467class == 0) {
                    str = "class";
                } else if (m2467class == 1) {
                    str = "interface";
                } else if (m2467class == 2) {
                    str = "enum class";
                } else if (m2467class == 3) {
                    str = "enum entry";
                } else if (m2467class == 4) {
                    str = "annotation class";
                } else {
                    if (m2467class != 5) {
                        throw new C14803e(10);
                    }
                    str = "object";
                }
            }
            sb.append(c8746e.m2482goto(str));
        }
        if (AbstractC14300e.mopub(abstractC17645e)) {
            C1577e c1577e = c17127e.f33529interface;
            InterfaceC8614e interfaceC8614e = C17127e.f33518strictfp[31];
            if (((Boolean) c1577e.ad).booleanValue()) {
                if (c8746e.admob()) {
                    sb.append("companion object");
                }
                C8746e.m2473catch(sb);
                InterfaceC15498e mo1351switch = abstractC17645e.mo1351switch();
                if (mo1351switch != null) {
                    sb.append("of ");
                    sb.append(c8746e.m2499try(mo1351switch.getName(), false));
                }
            }
            if (c8746e.pro() || !AbstractC7890e.billing(abstractC17645e.getName(), AbstractC13893e.vip)) {
                if (!c8746e.admob()) {
                    C8746e.m2473catch(sb);
                }
                sb.append(c8746e.m2499try(abstractC17645e.getName(), true));
            }
        } else {
            if (!c8746e.admob()) {
                C8746e.m2473catch(sb);
            }
            c8746e.m2491protected(abstractC17645e, sb, true);
        }
        if (!z) {
            List mo1221e = abstractC17645e.mo1221e();
            c8746e.m2489package(sb, mo1221e, false);
            c8746e.applovin(abstractC17645e, sb);
            if (!AbstractC17861e.vip(abstractC17645e.mo1724e())) {
                C1577e c1577e2 = c17127e.startapp;
                InterfaceC8614e interfaceC8614e2 = C17127e.f33518strictfp[7];
                if (((Boolean) c1577e2.ad).booleanValue() && (mo1722e = abstractC17645e.mo1722e()) != null) {
                    sb.append(" ");
                    c8746e.inmobi(sb, mo1722e, null);
                    C7283e c7283e = mo1722e;
                    c8746e.m2492static(c7283e.advert(), sb);
                    sb.append(c8746e.m2482goto("constructor"));
                    c8746e.m2485instanceof(sb, c7283e.mo330e(), mo1722e.mo328e());
                }
            }
            C1577e c1577e3 = c17127e.inmobi;
            InterfaceC8614e interfaceC8614e3 = C17127e.f33518strictfp[22];
            if (!((Boolean) c1577e3.ad).booleanValue() && !AbstractC13270e.firebase(abstractC17645e.mo1458e())) {
                Collection ad = abstractC17645e.mo1459goto().ad();
                if (!ad.isEmpty() && (ad.size() != 1 || !AbstractC13270e.inmobi((AbstractC1186e) ad.iterator().next()))) {
                    C8746e.m2473catch(sb);
                    sb.append(": ");
                    AbstractC13480e.m3610while(ad, sb, ", ", null, null, new C7007e(c8746e, 1), 60);
                }
            }
            c8746e.m2495synchronized(sb, mo1221e);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC17342e
    public void pro(long[] jArr) {
        long[] jArr2 = new long[4];
        AbstractC12447e.license(((long[][]) this.f2491e)[((int) (jArr[3] >>> 56)) & 255], jArr2);
        for (int i = 30; i >= 0; i--) {
            long j = jArr2[0];
            long j2 = jArr2[1];
            long j3 = jArr2[2];
            long j4 = jArr2[3];
            long j5 = j4 >>> 56;
            jArr2[0] = ((((j << 8) ^ j5) ^ (j5 << 2)) ^ (j5 << 5)) ^ (j5 << 10);
            jArr2[1] = (j2 << 8) | (j >>> 56);
            jArr2[2] = (j3 << 8) | (j2 >>> 56);
            jArr2[3] = (j4 << 8) | (j3 >>> 56);
            AbstractC12447e.ad(((long[][]) this.f2491e)[((int) (jArr[i >>> 3] >>> ((i & 7) << 3))) & 255], jArr2, jArr2);
        }
        AbstractC12447e.license(jArr2, jArr);
    }

    /* renamed from: protected, reason: not valid java name */
    public void m353protected(int i) {
        InterfaceC11855e interfaceC11855e = (InterfaceC11855e) this.f2491e;
        while ((i & (-128)) != 0) {
            interfaceC11855e.writeByte((i & 127) | 128);
            i >>>= 7;
        }
        interfaceC11855e.writeByte(i);
    }

    @Override // defpackage.InterfaceC17091e
    public void purchase(Object obj) {
        C13381e c13381e = (C13381e) obj;
        AbstractC15958e abstractC15958e = (AbstractC15958e) this.f2491e;
        C13188e c13188e = (C13188e) abstractC15958e.f31418class.pollFirst();
        if (c13188e == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = c13188e.f26193e;
        int i = c13188e.f26192e;
        AbstractComponentCallbacksC17875e applovin = abstractC15958e.metrica.applovin(str);
        if (applovin != null) {
            applovin.admob(i, c13381e.f26639e, c13381e.f26638e);
            return;
        }
        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
    }

    @Override // defpackage.InterfaceC17145e
    public C13747e remoteconfig(C12318e c12318e, List list) {
        return AbstractC2017e.license(new C9759e(-6));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039 A[LOOP:0: B:8:0x0033->B:10:0x0039, LOOP_END] */
    @Override // defpackage.InterfaceC10846e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void signatures(java.lang.String r14, long r15, int r17, java.lang.Object r18, long r19, long r21) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f2491e
            r1 = r0
            eۙٝ r1 = (defpackage.AbstractC18345e) r1
            eۢۗ r0 = new eۢۗ     // Catch: java.lang.IllegalStateException -> L18
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status     // Catch: java.lang.IllegalStateException -> L18
            r3 = 0
            r8 = r17
            r2.<init>(r8, r3, r3, r3)     // Catch: java.lang.IllegalStateException -> L16
            r0.<init>(r2)     // Catch: java.lang.IllegalStateException -> L16
            r1.adcel(r0)     // Catch: java.lang.IllegalStateException -> L16
            goto L2b
        L16:
            r0 = move-exception
            goto L1b
        L18:
            r0 = move-exception
            r8 = r17
        L1b:
            eۥَ r2 = defpackage.C5710e.adcel
            r3 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r2.ad
            java.lang.String r5 = "Result already set when calling onRequestCompleted"
            java.lang.String r2 = r2.license(r5, r3)
            android.util.Log.e(r4, r2, r0)
        L2b:
            eؘِٙ r0 = r1.signatures
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.yandex
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r0.next()
            r4 = r1
            eًۣۤ r4 = (defpackage.C8327e) r4
            r5 = r14
            r6 = r15
            r9 = r19
            r11 = r21
            r4.appmetrica(r5, r6, r8, r9, r11)
            r8 = r17
            goto L33
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0444e.signatures(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    @Override // defpackage.InterfaceC5369e
    public Object smaato(C2042e c2042e, Object obj) {
        m355throw(c2042e, (StringBuilder) obj, "setter");
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC5369e
    public Object startapp(C16169e c16169e, Object obj) {
        ((StringBuilder) obj).append(c16169e.getName());
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC5369e
    public Object subs(AbstractC14941e abstractC14941e, Object obj) {
        StringBuilder sb = (StringBuilder) obj;
        C8746e c8746e = (C8746e) this.f2491e;
        c8746e.getClass();
        C12816e c12816e = abstractC14941e.f29618e;
        sb.append(c8746e.m2482goto("package-fragment"));
        String loadAd = c8746e.loadAd(AbstractC10681e.startapp(C13579e.purchase(c12816e.ad)));
        if (loadAd.length() > 0) {
            sb.append(" ");
            sb.append(loadAd);
        }
        if (c8746e.ad.amazon()) {
            sb.append(" in ");
            c8746e.m2491protected(abstractC14941e.m3889e(), sb, false);
        }
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC14187e
    public void subscription(C4602e c4602e, C11058e c11058e) {
        C2342e c2342e = (C2342e) ((C13935e) this.f2491e).f27641e;
        try {
            if (!c11058e.f21939e) {
                c2342e.billing(Boolean.FALSE);
                return;
            }
            JSONObject jSONObject = new JSONObject(c11058e.f21945e.advert()).getJSONObject("session");
            String string = jSONObject.getString("name");
            AbstractC8561e.ad.edit().putString("username", string).putString("sessionKey", jSONObject.getString("key")).apply();
            c2342e.billing(Boolean.TRUE);
        } catch (JSONException e) {
            e.printStackTrace();
            c2342e.billing(Boolean.FALSE);
        } finally {
            c11058e.close();
        }
    }

    @Override // defpackage.InterfaceC5369e
    public Object tapsense(C16113e c16113e, Object obj) {
        ((C8746e) this.f2491e).m2491protected(c16113e, (StringBuilder) obj, true);
        return Unit.INSTANCE;
    }

    /* renamed from: this, reason: not valid java name */
    public int m354this(String str) {
        WorkDatabase workDatabase = (WorkDatabase) this.f2491e;
        workDatabase.metrica();
        try {
            Long pro = workDatabase.adcel().pro(str);
            int i = 0;
            int intValue = pro != null ? pro.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i = intValue + 1;
            }
            workDatabase.adcel().tapsense(new C12377e(i, str));
            workDatabase.yandex();
            workDatabase.purchase();
            return intValue;
        } catch (Throwable th) {
            workDatabase.purchase();
            throw th;
        }
    }

    /* renamed from: throw, reason: not valid java name */
    public void m355throw(AbstractC15855e abstractC15855e, StringBuilder sb, String str) {
        C8746e c8746e = (C8746e) this.f2491e;
        C1577e c1577e = c8746e.ad.f33527goto;
        InterfaceC8614e interfaceC8614e = C17127e.f33518strictfp[32];
        int ordinal = ((EnumC1891e) c1577e.ad).ordinal();
        if (ordinal == 0) {
            c8746e.m2487native(abstractC15855e, sb);
            sb.append(str.concat(" for "));
            C8746e.amazon(c8746e, abstractC15855e.m4030e(), sb);
        } else if (ordinal == 1) {
            m349extends(abstractC15855e, sb);
        } else if (ordinal != 2) {
            throw new C14803e(10);
        }
    }

    /* renamed from: try, reason: not valid java name */
    public void m356try(C0193e c0193e) {
        ((InterfaceC11855e) this.f2491e).applovin(c0193e);
    }

    @Override // defpackage.InterfaceC5369e
    public Object vip(C7901e c7901e, Object obj) {
        m355throw(c7901e, (StringBuilder) obj, "getter");
        return Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC2581e
    /* renamed from: while, reason: not valid java name */
    public Function0 mo357while(AbstractC5133e abstractC5133e) {
        AbstractC0003e abstractC0003e = (AbstractC0003e) this.f2491e;
        if (((C4891e) abstractC0003e).license.compareTo(EnumC7785e.f15780e) > 0) {
            C9993e c9993e = new C9993e(1, abstractC5133e);
            abstractC0003e.ad(c9993e);
            return new C14194e(abstractC0003e, c9993e, 13);
        }
        throw new IllegalStateException(("Cannot configure " + abstractC5133e + " to disposeComposition at Lifecycle ON_DESTROY: " + abstractC0003e + "is already destroyed").toString());
    }

    @Override // defpackage.InterfaceC14309e
    public void yandex(Throwable th) {
        ((C0485e) this.f2491e).amazon(th);
    }
}
