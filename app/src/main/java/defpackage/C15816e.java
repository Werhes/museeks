package defpackage;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NotificationCallback;
import io.realm.kotlin.internal.interop.realm_binary_t;
import io.realm.kotlin.internal.interop.realm_decimal128_t;
import io.realm.kotlin.internal.interop.realm_link_t;
import io.realm.kotlin.internal.interop.realm_query_arg_t;
import io.realm.kotlin.internal.interop.realm_timestamp_t;
import io.realm.kotlin.internal.interop.realm_value_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.conscrypt.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۣۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C15816e implements InterfaceC2062e, InterfaceC1620e, InterfaceC3249e, InterfaceC5369e, InterfaceC12379e, InterfaceC12233e, InterfaceC15269e, InterfaceC1145e, InterfaceC2088e, NotificationCallback, InterfaceC1133e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static volatile C15816e f31188e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C3955e f31189e = new C3955e(1);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f31190e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31191e;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, eٗؑۙ] */
    public C15816e(int i) {
        InterfaceC18169e interfaceC18169e;
        this.f31191e = i;
        switch (i) {
            case 1:
                Class cls = AbstractC2037e.ad;
                try {
                    interfaceC18169e = (InterfaceC18169e) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    interfaceC18169e = f31189e;
                }
                InterfaceC18169e[] interfaceC18169eArr = {C3955e.vip, interfaceC18169e};
                ?? obj = new Object();
                obj.ad = interfaceC18169eArr;
                Charset charset = AbstractC2930e.ad;
                this.f31190e = obj;
                return;
            case 2:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f31190e = new C7091e(this);
                    return;
                } else {
                    this.f31190e = new C7091e(this);
                    return;
                }
            case 3:
                this.f31190e = new AtomicReference(null);
                return;
            case 5:
                this.f31190e = new C0731e(3);
                return;
            case 6:
                this.f31190e = new ByteArrayOutputStream();
                return;
            case 9:
                this.f31190e = new ConcurrentHashMap(16);
                return;
            case 12:
                this.f31190e = new C12041e(5, 1.0f, false, 0);
                return;
            case 15:
                this.f31190e = new C0444e(14);
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                this.f31190e = new ArrayList();
                return;
            default:
                this.f31190e = r7;
                String[] strArr = {"Band", "Linear"};
                return;
        }
    }

    public /* synthetic */ C15816e(int i, Object obj) {
        this.f31191e = i;
        this.f31190e = obj;
    }

    public /* synthetic */ C15816e(int i, boolean z) {
        this.f31191e = i;
    }

    public C15816e(Notification notification) {
        this.f31191e = 18;
        notification.getClass();
        this.f31190e = notification;
    }

    public C15816e(Context context) {
        this.f31191e = 10;
        this.f31190e = context.getApplicationContext();
    }

    public C15816e(InputStream inputStream) {
        this.f31191e = 21;
        EnumC11433e enumC11433e = EnumC11433e.f22984e;
        C1400e c1400e = C1400e.f4213e;
        if (inputStream == null) {
            throw new IllegalArgumentException("inputStream is null");
        }
        AbstractC0815e.f3204e = c1400e;
        int m2467class = AbstractC8703e.m2467class(2);
        if (m2467class == 0) {
            this.f31190e = new AbstractC11130e(inputStream);
        } else {
            if (m2467class != 1) {
                throw new RuntimeException("unsupported format detected, this should be impossible: ".concat("EXT_M3U"));
            }
            this.f31190e = new C9330e(inputStream);
        }
    }

    /* renamed from: abstract, reason: not valid java name */
    public static String m4010abstract(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public static C15816e signatures(Object obj) {
        if (obj != null) {
            return new C15816e(14, obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00af, code lost:
    
        if (r1 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00fc, code lost:
    
        if (r10 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0103, code lost:
    
        return new defpackage.C7003e(r10, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0104, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c2, code lost:
    
        if (r2 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e5, code lost:
    
        if (r4 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fa, code lost:
    
        if (r3 == false) goto L74;
     */
    /* renamed from: this, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C7003e m4011this(defpackage.AbstractC3677e r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15816e.m4011this(eؕۡ, java.util.List):eؚؚۘ");
    }

    @Override // defpackage.InterfaceC5369e
    public Object Signature(C14887e c14887e, Object obj) {
        return null;
    }

    @Override // defpackage.InterfaceC1145e
    public void ad(InterfaceC14239e interfaceC14239e) {
        C8630e c8630e = ((C11981e) this.f31190e).license.f14980e.license;
        C12931e amazon = interfaceC14239e.amazon();
        ((C11981e) this.f31190e).license.f14978e.getClass();
        C3278e c3278e = c8630e.ad;
        synchronized (c3278e.f7430e) {
            C0485e c0485e = c3278e.f7429e;
            c0485e.getClass();
            c0485e.smaato(new C7637e(amazon));
        }
        ((C11981e) this.f31190e).license.f14980e.ad();
    }

    public realm_value_t adcel(Boolean bool) {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.billing(bool == null ? 0 : 2);
        if (bool != null) {
            realmcJNI.realm_value_t__boolean_set(realm_value_tVar.ad, realm_value_tVar, bool.booleanValue());
        }
        return realm_value_tVar;
    }

    @Override // defpackage.InterfaceC5369e
    public Object admob(C14457e c14457e, Object obj) {
        return null;
    }

    @Override // defpackage.InterfaceC5369e
    public Object ads(InterfaceC16528e interfaceC16528e, Object obj) {
        return new C10208e((AbstractC15529e) this.f31190e, interfaceC16528e);
    }

    public realm_value_t advert(byte[] bArr) {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.billing(bArr == null ? 0 : 4);
        if (bArr != null) {
            realm_binary_t realm_binary_tVar = new realm_binary_t(realmcJNI.new_realm_binary_t(), true);
            realmcJNI.realm_binary_t_data_set(realm_binary_tVar.ad, realm_binary_tVar, bArr);
            realmcJNI.realm_binary_t_size_set(realm_binary_tVar.ad, realm_binary_tVar, bArr.length);
            realmcJNI.realm_value_t_binary_set(realm_value_tVar.ad, realm_value_tVar, realm_binary_tVar.ad, realm_binary_tVar);
        }
        ((LinkedHashSet) ((C0444e) this.f31190e).f2491e).add(realm_value_tVar);
        return realm_value_tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.InterfaceC1133e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable amazon(defpackage.AbstractC10731e r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f31190e
            ua.itaysonlab.vkapi2.objects.music.AudioTrack r0 = (ua.itaysonlab.vkapi2.objects.music.AudioTrack) r0
            boolean r1 = r8 instanceof defpackage.C17881e
            if (r1 == 0) goto L17
            r1 = r8
            eٜ٘ۗ r1 = (defpackage.C17881e) r1
            int r2 = r1.f35119e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f35119e = r2
            goto L1c
        L17:
            eٜ٘ۗ r1 = new eٜ٘ۗ
            r1.<init>(r7, r8)
        L1c:
            java.lang.Object r8 = r1.f35122e
            int r2 = r1.f35119e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            eؒٛؕ r0 = r1.f35118e
            eؒٛؕ r1 = r1.f35120e
            defpackage.AbstractC2003e.purchase(r8)
            goto L68
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            defpackage.AbstractC2003e.purchase(r8)
            eؒٛؕ r8 = defpackage.AbstractC6874e.license()
            int r2 = defpackage.C13552e.f26851e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r0.ad
            r2.append(r4)
            r4 = 32
            r2.append(r4)
            java.lang.String r0 = r0.license
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.f35120e = r8
            r1.f35118e = r8
            r1.f35119e = r3
            java.lang.Object r0 = defpackage.C10068e.metrica(r0, r1)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r0 != r1) goto L65
            return r1
        L65:
            r1 = r8
            r8 = r0
            r0 = r1
        L68:
            bruhcollective.itaysonlab.libvkmusic.methods.uma.UmaSearch$Preapi r8 = (bruhcollective.itaysonlab.libvkmusic.methods.uma.UmaSearch$Preapi) r8
            java.util.List r2 = r8.vip
            java.lang.Object r2 = defpackage.AbstractC13480e.m3604this(r2)
            bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack r2 = (bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack) r2
            if (r2 != 0) goto L80
            java.util.List r8 = r8.ad
            java.lang.Object r8 = defpackage.AbstractC13480e.m3604this(r8)
            r2 = r8
            bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack r2 = (bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack) r2
            if (r2 != 0) goto L80
            goto Lcc
        L80:
            boolean r8 = r2.adcel
            if (r8 == 0) goto L91
            eؚٕۢ r8 = new eؚٕۢ
            java.lang.String r3 = r2.vip
            java.lang.String r4 = r2.ad
            r5 = 4
            r8.<init>(r3, r5, r4)
            r0.add(r8)
        L91:
            bruhcollective.itaysonlab.libvkmusic.objects.UmaAlbum r8 = r2.purchase
            if (r8 == 0) goto La6
            eؚٕۢ r3 = new eؚٕۢ
            java.lang.String r4 = r8.ad
            long r5 = r8.vip
            java.lang.String r8 = java.lang.String.valueOf(r5)
            r5 = 2
            r3.<init>(r4, r5, r8)
            r0.add(r3)
        La6:
            java.util.List r8 = r2.yandex
            if (r8 == 0) goto Lcc
            java.util.Iterator r8 = r8.iterator()
        Lae:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lcc
            java.lang.Object r2 = r8.next()
            bruhcollective.itaysonlab.libvkmusic.objects.UmaArtist r2 = (bruhcollective.itaysonlab.libvkmusic.objects.UmaArtist) r2
            eؚٕۢ r3 = new eؚٕۢ
            java.lang.String r4 = r2.vip
            long r5 = r2.metrica
            java.lang.String r2 = java.lang.String.valueOf(r5)
            r5 = 5
            r3.<init>(r4, r5, r2)
            r0.add(r3)
            goto Lae
        Lcc:
            eؒٛؕ r8 = defpackage.AbstractC6874e.metrica(r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15816e.amazon(eُؑ۠):java.io.Serializable");
    }

    public realm_value_t applovin(Double d) {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.billing(d == null ? 0 : 7);
        if (d != null) {
            realmcJNI.realm_value_t_dnum_set(realm_value_tVar.ad, realm_value_tVar, d.doubleValue());
        }
        return realm_value_tVar;
    }

    @Override // defpackage.InterfaceC2088e
    public C11154e appmetrica() {
        throw null;
    }

    @Override // defpackage.InterfaceC5369e
    public Object billing(AbstractC17288e abstractC17288e, Object obj) {
        return null;
    }

    /* renamed from: break, reason: not valid java name */
    public realm_value_t m4012break(C13655e c13655e) {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.billing(c13655e == null ? 0 : 10);
        if (c13655e != null) {
            long ptr$cinterop_release = c13655e.f27071e.getPtr$cinterop_release();
            int i = AbstractC6026e.ad;
            realm_value_tVar.purchase(new realm_link_t(realmcJNI.realm_object_as_link(ptr$cinterop_release), true));
        }
        return realm_value_tVar;
    }

    /* renamed from: case, reason: not valid java name */
    public void m4013case(int i) {
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f31190e;
        byteArrayOutputStream.write((byte) (i >>> 24));
        byteArrayOutputStream.write((byte) (i >>> 16));
        byteArrayOutputStream.write((byte) (i >>> 8));
        byteArrayOutputStream.write((byte) i);
    }

    /* renamed from: catch, reason: not valid java name */
    public void m4014catch(String str) {
        ((OutputStreamWriter) this.f31190e).write(AbstractC10257e.adcel(str, "\n"));
    }

    /* renamed from: class */
    public Object mo348class(C7283e c7283e, Object obj) {
        return ads(c7283e, obj);
    }

    public C8092e crashlytics(int i) {
        return null;
    }

    /* renamed from: default, reason: not valid java name */
    public realm_value_t m4015default(String str) {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.billing(str == null ? 0 : 3);
        if (str != null) {
            realmcJNI.realm_value_t_string_set(realm_value_tVar.ad, realm_value_tVar, str);
        }
        ((LinkedHashSet) ((C0444e) this.f31190e).f2491e).add(realm_value_tVar);
        return realm_value_tVar;
    }

    /* renamed from: extends, reason: not valid java name */
    public C17118e m4016extends(C0660e c0660e) {
        long purchase;
        C13648e c13648e = (C13648e) this.f31190e;
        float f = c0660e.ad;
        float f2 = c0660e.vip;
        int ordinal = m4021native().ordinal();
        if (ordinal == 0) {
            purchase = c13648e.purchase() & 4294967295L;
        } else {
            if (ordinal != 1) {
                throw new C14803e(10);
            }
            purchase = c13648e.purchase() >> 32;
        }
        return new C17118e(f, ((int) purchase) - f2);
    }

    /* renamed from: final, reason: not valid java name */
    public void m4017final(String str) {
        m4014catch("#" + str);
    }

    public realm_value_t firebase(Float f) {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.billing(f == null ? 0 : 6);
        if (f != null) {
            realmcJNI.realm_value_t_fnum_set(realm_value_tVar.ad, realm_value_tVar, f.floatValue());
        }
        return realm_value_tVar;
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        switch (this.f31191e) {
            case 11:
                String packageName = ((Context) ((InterfaceC16964e) this.f31190e).get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return this.f31190e;
        }
    }

    @Override // defpackage.InterfaceC2062e
    public String getValue(int i) {
        String str;
        return (mo269instanceof(i) && (str = ((String[]) this.f31190e)[i]) != null) ? str : BuildConfig.FLAVOR;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
    
        return defpackage.C2274e.ad;
     */
    /* renamed from: goto, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.InterfaceC11640e m4018goto(defpackage.C17469e r5, java.util.ArrayList r6, int r7, java.util.List r8) {
        /*
            r4 = this;
            int r0 = r6.size()
            if (r7 < r0) goto La7
            java.util.Set r6 = r5.license
            java.util.LinkedHashSet r6 = defpackage.AbstractC4511e.loadAd(r6, r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "getFeatureListResolvedByPriority: features = "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r8 = ", useCases = "
            r7.append(r8)
            java.util.List r8 = r5.purchase
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "DefaultFeatureGroupResolver"
            defpackage.AbstractC9464e.yandex(r8, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.AbstractC0746e.subscription(r6, r8)
            r7.<init>(r8)
            java.util.Iterator r8 = r6.iterator()
        L38:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r8.next()
            eؕۡ r0 = (defpackage.AbstractC3677e) r0
            eؚؖؐ r0 = r0.ad()
            r7.add(r0)
            goto L38
        L4c:
            java.util.List r7 = defpackage.AbstractC13480e.premium(r7)
            java.util.Iterator r7 = r7.iterator()
        L54:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L88
            java.lang.Object r8 = r7.next()
            eؚؖؐ r8 = (defpackage.EnumC3797e) r8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r6.iterator()
        L69:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L80
            java.lang.Object r2 = r1.next()
            r3 = r2
            eؕۡ r3 = (defpackage.AbstractC3677e) r3
            eؚؖؐ r3 = r3.ad()
            if (r3 != r8) goto L69
            r0.add(r2)
            goto L69
        L80:
            int r8 = r0.size()
            r0 = 1
            if (r8 <= r0) goto L54
            goto La4
        L88:
            java.lang.Object r7 = r4.f31190e
            eِّٔ r7 = (defpackage.InterfaceC12424e) r7
            eؘؔؕ r8 = new eؘؔؕ
            r0 = 2
            r8.<init>(r0, r6)
            boolean r5 = r7.mo3346while(r8, r5)
            if (r5 == 0) goto La4
            eؙؑۤ r5 = new eؙؑۤ
            eؘؔؕ r7 = new eؘؔؕ
            r8 = 2
            r7.<init>(r8, r6)
            r5.<init>(r7)
            return r5
        La4:
            eؓۨۨ r5 = defpackage.C2274e.ad
            return r5
        La7:
            int r0 = r7 + 1
            java.lang.Object r7 = r6.get(r7)
            java.util.ArrayList r7 = defpackage.AbstractC13480e.m3572catch(r7, r8)
            eٍِۤ r7 = r4.m4018goto(r5, r6, r0, r7)
            boolean r1 = r7 instanceof defpackage.C0157e
            if (r1 == 0) goto Lba
            return r7
        Lba:
            eٍِۤ r5 = r4.m4018goto(r5, r6, r0, r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15816e.m4018goto(eؘ٘ؑ, java.util.ArrayList, int, java.util.List):eٍِۤ");
    }

    /* renamed from: implements, reason: not valid java name */
    public realm_value_t m4019implements(InterfaceC4476e interfaceC4476e) {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.billing(interfaceC4476e == null ? 0 : 5);
        if (interfaceC4476e != null) {
            realm_timestamp_t realm_timestamp_tVar = new realm_timestamp_t(realmcJNI.new_realm_timestamp_t(), true);
            realmcJNI.realm_timestamp_t_seconds_set(realm_timestamp_tVar.ad, realm_timestamp_tVar, interfaceC4476e.ad());
            realmcJNI.realm_timestamp_t_nanoseconds_set(realm_timestamp_tVar.ad, realm_timestamp_tVar, interfaceC4476e.vip());
            realmcJNI.realm_value_t_timestamp_set(realm_value_tVar.ad, realm_value_tVar, realm_timestamp_tVar.ad, realm_timestamp_tVar);
        }
        return realm_value_tVar;
    }

    public realm_value_t inmobi(C12355e c12355e) {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.billing(c12355e == null ? 0 : 8);
        if (c12355e != null) {
            realm_decimal128_t realm_decimal128_tVar = new realm_decimal128_t(realmcJNI.new_realm_decimal128_t(), true);
            C15563e c15563e = c12355e.f24776e;
            realmcJNI.realm_decimal128_t_w_set(realm_decimal128_tVar.ad, realm_decimal128_tVar, Arrays.copyOf(new long[]{c15563e.vip, c15563e.ad}, 2));
            realmcJNI.realm_value_t_decimal128_set(realm_value_tVar.ad, realm_value_tVar, realm_decimal128_tVar.ad, realm_decimal128_tVar);
        }
        return realm_value_tVar;
    }

    @Override // defpackage.InterfaceC2062e
    /* renamed from: instanceof */
    public boolean mo269instanceof(int i) {
        return i >= 0 && i <= 1;
    }

    /* renamed from: interface, reason: not valid java name */
    public void m4020interface() {
        for (Object obj : (LinkedHashSet) ((C0444e) this.f31190e).f2491e) {
            if (obj instanceof realm_value_t) {
                realm_value_t realm_value_tVar = (realm_value_t) obj;
                int i = AbstractC6026e.ad;
                realmcJNI.realm_value_t_cleanup(realm_value_tVar.ad, realm_value_tVar);
            } else if (obj instanceof C10896e) {
                realm_query_arg_t realm_query_arg_tVar = ((C10896e) obj).vip;
                int i2 = AbstractC6026e.ad;
                realmcJNI.delete_queryArgArray(realm_query_arg_t.ad(realm_query_arg_tVar), realm_query_arg_tVar);
            } else if (obj instanceof C9900e) {
                realm_value_t realm_value_tVar2 = (realm_value_t) ((C9900e) obj).ad.f26878e;
                int i3 = AbstractC6026e.ad;
                realmcJNI.delete_valueArray(realm_value_t.vip(realm_value_tVar2), realm_value_tVar2);
            }
        }
    }

    @Override // defpackage.InterfaceC5369e
    public Object isPro(C10162e c10162e, Object obj) {
        int i;
        AbstractC15529e abstractC15529e = (AbstractC15529e) this.f31190e;
        if (c10162e.mo2242e().isEmpty()) {
            i = (c10162e.f20102e != null ? 1 : 0) + (c10162e.f20113e != null ? 1 : 0);
        } else {
            i = -1;
        }
        if (c10162e.f20118e) {
            if (i == -1) {
                return new C16143e(abstractC15529e, c10162e);
            }
            if (i == 0) {
                return new C12641e(abstractC15529e, c10162e);
            }
            if (i == 1) {
                return new C14657e(abstractC15529e, c10162e);
            }
            if (i == 2) {
                return new C10578e(abstractC15529e, c10162e);
            }
        } else {
            if (i == -1) {
                return new C5493e(abstractC15529e, c10162e);
            }
            if (i == 0) {
                return new C5785e(abstractC15529e, c10162e);
            }
            if (i == 1) {
                return new C7565e(abstractC15529e, c10162e);
            }
            if (i == 2) {
                return new C8333e(abstractC15529e, c10162e);
            }
        }
        throw new Error("Unsupported property: " + c10162e);
    }

    public C8092e isVip(int i) {
        return null;
    }

    @Override // defpackage.InterfaceC3249e
    public void license(C5985e c5985e) {
        this.f31190e = c5985e;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    public void loadAd(InterfaceC3928e interfaceC3928e) {
        try {
            ((ByteArrayOutputStream) this.f31190e).write(interfaceC3928e.getEncoded());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    @Override // defpackage.InterfaceC5369e
    public Object metrica(C13043e c13043e, Object obj) {
        return null;
    }

    @Override // defpackage.InterfaceC13344e
    public void mopub(InterfaceC14585e interfaceC14585e) {
        ((C11981e) this.f31190e).license.f14980e.metrica.ad(3).vip();
    }

    /* renamed from: native, reason: not valid java name */
    public EnumC17426e m4021native() {
        return ((C13648e) this.f31190e).loadAd;
    }

    @Override // io.realm.kotlin.internal.interop.NotificationCallback
    public void onChange(long j) {
        C0912e c0912e = (C0912e) this.f31190e;
        int i = AbstractC6026e.ad;
        c0912e.smaato(new LongPointerWrapper(realmcJNI.realm_clone(j), true));
    }

    @Override // defpackage.InterfaceC5369e
    public Object premium(AbstractC17645e abstractC17645e, Object obj) {
        return null;
    }

    public void pro() {
        ((C0560e) ((C0731e) this.f31190e).f3025e).loadAd(null);
    }

    /* renamed from: protected */
    public boolean mo1692protected(int i, int i2, Bundle bundle) {
        return false;
    }

    @Override // defpackage.InterfaceC12379e
    public void purchase(AbstractC12947e abstractC12947e) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC9760e("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC4904e(16, this, abstractC12947e, threadPoolExecutor));
    }

    @Override // defpackage.InterfaceC1620e
    public void remoteconfig(String str, Bundle bundle) {
        C5985e c5985e = (C5985e) this.f31190e;
        if (c5985e != null) {
            try {
                String str2 = "$A$:" + m4010abstract(str, bundle);
                C8598e c8598e = c5985e.ad;
                ((ExecutorC4614e) c8598e.loadAd.f25751e).ad(new RunnableC3883e(c8598e, System.currentTimeMillis() - c8598e.license, str2, 0));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    @Override // defpackage.InterfaceC5369e
    public Object smaato(C2042e c2042e, Object obj) {
        return ads(c2042e, obj);
    }

    @Override // defpackage.InterfaceC5369e
    public Object startapp(C16169e c16169e, Object obj) {
        return null;
    }

    @Override // defpackage.InterfaceC5369e
    public Object subs(AbstractC14941e abstractC14941e, Object obj) {
        return null;
    }

    public void subscription(byte[] bArr) {
        try {
            ((ByteArrayOutputStream) this.f31190e).write(bArr);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /* renamed from: super, reason: not valid java name */
    public void m4022super(String str, String str2) {
        m4014catch("#" + str + ":" + str2);
    }

    @Override // defpackage.InterfaceC5369e
    public Object tapsense(C16113e c16113e, Object obj) {
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Iterable] */
    /* renamed from: throw, reason: not valid java name */
    public ArrayList m4023throw() {
        ?? r0 = ((C13648e) this.f31190e).mopub;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(r0, 10));
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            arrayList.add(new C2164e((C3225e) it.next(), m4021native()));
        }
        return arrayList;
    }

    /* renamed from: try, reason: not valid java name */
    public realm_value_t m4024try() {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.billing(0);
        return realm_value_tVar;
    }

    @Override // defpackage.InterfaceC5369e
    public Object vip(C7901e c7901e, Object obj) {
        return ads(c7901e, obj);
    }

    /* renamed from: while, reason: not valid java name */
    public realm_value_t m4025while(Long l) {
        realm_value_t realm_value_tVar = new realm_value_t();
        realm_value_tVar.billing(l == null ? 0 : 1);
        if (l != null) {
            realmcJNI.realm_value_t_integer_set(realm_value_tVar.ad, realm_value_tVar, l.longValue());
        }
        return realm_value_tVar;
    }

    public void yandex(int i, C8092e c8092e, String str, Bundle bundle) {
    }
}
