package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.SparseBooleanArray;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.car.app.navigation.model.Maneuver;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؒۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C16722e implements InterfaceC9250e, InterfaceC14071e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f32780e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f32781e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32782e;

    public C16722e(int i) {
        this.f32782e = i;
        switch (i) {
            case 5:
                this.f32780e = new SparseBooleanArray();
                return;
            default:
                this.f32780e = new HashMap();
                return;
        }
    }

    public /* synthetic */ C16722e(int i, Object obj) {
        this.f32782e = i;
        this.f32780e = obj;
    }

    public C16722e(Context context, C11725e c11725e) {
        this.f32782e = 1;
        boolean z = false;
        this.f32781e = Build.VERSION.SDK_INT >= 34 && AbstractC5666e.mopub(context) != 0;
        PackageManager packageManager = context.getPackageManager();
        Integer vip = c11725e != null ? c11725e.vip() : null;
        boolean hasSystemFeature = packageManager.hasSystemFeature("android.hardware.camera");
        boolean hasSystemFeature2 = packageManager.hasSystemFeature("android.hardware.camera.front");
        boolean z2 = hasSystemFeature && (vip == null || vip.intValue() == 1);
        if (hasSystemFeature2 && (vip == null || vip.intValue() == 0)) {
            z = true;
        }
        this.f32780e = new C5986e(z2, z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16722e(C5170e c5170e, boolean z) {
        this(11, c5170e);
        this.f32782e = 11;
        this.f32781e = z;
    }

    public C16722e(InterfaceC14071e interfaceC14071e) {
        this.f32782e = 13;
        this.f32780e = interfaceC14071e;
        this.f32781e = interfaceC14071e.mo855const();
    }

    public /* synthetic */ C16722e(Object obj, int i, boolean z) {
        this.f32782e = i;
        this.f32780e = obj;
        this.f32781e = true;
    }

    public /* synthetic */ C16722e(Object obj, boolean z, int i) {
        this.f32782e = i;
        this.f32780e = obj;
        this.f32781e = z;
    }

    public C16722e(Executor executor, CameraCharacteristics cameraCharacteristics) {
        this.f32782e = 7;
        C3909e c3909e = AbstractC2170e.ad;
        if (AbstractC2170e.ad.vip(LowMemoryQuirk.class) != null) {
            new ExecutorC12245e(executor);
        }
        this.f32780e = c3909e;
        this.f32781e = c3909e.ad(IncorrectJpegMetadataQuirk.class);
    }

    public static boolean adcel(Set set, C11725e c11725e) {
        try {
            c11725e.metrica(new LinkedHashSet(set));
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void Signature(char c) {
        ((InterfaceC9483e) this.f32780e).subs(c);
    }

    public void ad(int i) {
        AbstractC2301e.subscription(!this.f32781e);
        ((SparseBooleanArray) this.f32780e).append(i, true);
    }

    public void admob(int i) {
        ((InterfaceC9483e) this.f32780e).writeLong(i);
    }

    public boolean advert(LinkedHashSet linkedHashSet, Set set) {
        C5986e c5986e = (C5986e) this.f32780e;
        if (!this.f32781e) {
            boolean z = c5986e.ad;
            boolean z2 = c5986e.vip;
            if (z || z2) {
                boolean adcel = adcel(linkedHashSet, C11725e.metrica);
                boolean adcel2 = adcel(linkedHashSet, C11725e.vip);
                Set set2 = set;
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(set2, 10));
                Iterator it = set2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C14131e) it.next()).ad());
                }
                Set m3582e = AbstractC13480e.m3582e(arrayList);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : linkedHashSet) {
                    if (!m3582e.contains(((InterfaceC2881e) obj).subscription().billing())) {
                        arrayList2.add(obj);
                    }
                }
                Set m3582e2 = AbstractC13480e.m3582e(arrayList2);
                boolean adcel3 = adcel(m3582e2, C11725e.metrica);
                boolean adcel4 = adcel(m3582e2, C11725e.vip);
                boolean z3 = c5986e.ad && adcel && !adcel3;
                boolean z4 = z2 && adcel2 && !adcel4;
                if (z3 || z4) {
                    return true;
                }
            }
        }
        return false;
    }

    public void amazon() {
        this.f32781e = false;
    }

    public void applovin(C3862e c3862e) {
        C5986e c5986e = (C5986e) this.f32780e;
        if (this.f32781e) {
            AbstractC9464e.yandex("CameraValidator", "Virtual device with " + c3862e.license().size() + " cameras. Skipping validation.");
            return;
        }
        AbstractC9464e.yandex("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE);
        if (c5986e.ad) {
            try {
                C11725e.metrica.metrica(c3862e.license());
            } catch (RuntimeException e) {
                e = e;
                AbstractC9464e.pro("CameraValidator", "Camera LENS_FACING_BACK verification failed", e);
            }
        }
        e = null;
        if (c5986e.vip) {
            try {
                C11725e.vip.metrica(c3862e.license());
            } catch (RuntimeException e2) {
                AbstractC9464e.pro("CameraValidator", "Camera LENS_FACING_FRONT verification failed", e2);
                if (e == null) {
                    e = e2;
                }
            }
        }
        if (e != null) {
            throw new C7858e(c3862e.license().size(), e);
        }
    }

    public C11715e appmetrica() {
        AbstractC2301e.subscription(!this.f32781e);
        this.f32781e = true;
        return new C11715e((SparseBooleanArray) this.f32780e);
    }

    public void billing() {
        if (this.f32781e) {
            return;
        }
        this.f32781e = true;
        Iterator it = AbstractC13480e.m3575continue(((HashMap) this.f32780e).values()).iterator();
        while (it.hasNext()) {
            ((InterfaceC4095e) it.next()).onDestroy();
        }
    }

    @Override // defpackage.InterfaceC14071e
    public InterfaceC11129e build() {
        return AbstractC5857e.ad((InterfaceC14071e) this.f32780e);
    }

    @Override // defpackage.InterfaceC2484e
    public void clear() {
        ((InterfaceC14071e) this.f32780e).clear();
    }

    @Override // defpackage.InterfaceC2484e
    /* renamed from: const */
    public boolean mo855const() {
        return this.f32781e;
    }

    @Override // defpackage.InterfaceC2484e
    public boolean contains(String str) {
        return ((InterfaceC14071e) this.f32780e).contains(AbstractC6528e.appmetrica(str, false));
    }

    @Override // defpackage.InterfaceC2484e
    /* renamed from: eٍۢؒ */
    public List mo856e(String str) {
        List mo856e = ((InterfaceC14071e) this.f32780e).mo856e(AbstractC6528e.appmetrica(str, false));
        if (mo856e == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(mo856e, 10));
        Iterator it = mo856e.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC6528e.license(0, 0, 11, (String) it.next()));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC2484e
    /* renamed from: eُۘٙ */
    public Set mo857e() {
        Set mo857e = ((InterfaceC14071e) this.f32780e).mo857e();
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(mo857e, 10));
        Iterator it = mo857e.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC6528e.license(0, 0, 15, (String) it.next()));
        }
        return AbstractC13480e.m3582e(arrayList);
    }

    @Override // defpackage.InterfaceC2484e
    /* renamed from: eٔٞۢ */
    public void mo858e(String str, List list) {
        InterfaceC14071e interfaceC14071e = (InterfaceC14071e) this.f32780e;
        String appmetrica = AbstractC6528e.appmetrica(str, false);
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC6528e.appmetrica((String) it.next(), true));
        }
        interfaceC14071e.mo858e(appmetrica, arrayList);
    }

    @Override // defpackage.InterfaceC2484e
    /* renamed from: eٔۚٙ */
    public void mo859e(String str, String str2) {
        ((InterfaceC14071e) this.f32780e).mo859e(AbstractC6528e.appmetrica(str, false), AbstractC6528e.appmetrica(str2, true));
    }

    public void inmobi() {
    }

    @Override // defpackage.InterfaceC2484e
    public boolean isEmpty() {
        return ((InterfaceC14071e) this.f32780e).isEmpty();
    }

    public void isPro() {
    }

    public void isVip(Object obj, InterfaceC4095e interfaceC4095e) {
        HashMap hashMap = (HashMap) this.f32780e;
        if (hashMap.containsKey(obj)) {
            throw new IllegalStateException(AbstractC1634e.advert(obj, "Another instance is already associated with the key: ").toString());
        }
        hashMap.put(obj, interfaceC4095e);
        if (this.f32781e) {
            interfaceC4095e.onDestroy();
        }
    }

    public void license(int... iArr) {
        for (int i : iArr) {
            ad(i);
        }
    }

    public void loadAd(byte b) {
        ((InterfaceC9483e) this.f32780e).writeLong(b);
    }

    public void metrica(C11715e c11715e) {
        for (int i = 0; i < c11715e.ad.size(); i++) {
            ad(c11715e.vip(i));
        }
    }

    @Override // defpackage.InterfaceC2484e
    public Set mopub() {
        return ((AbstractC1116e) AbstractC5857e.ad((InterfaceC14071e) this.f32780e)).mopub();
    }

    public void pro(short s) {
        ((InterfaceC9483e) this.f32780e).writeLong(s);
    }

    public boolean purchase() {
        return this.f32781e;
    }

    public void remoteconfig(String str) {
        ((InterfaceC9483e) this.f32780e).mo2228this(str);
    }

    public void signatures(String str) {
        ((InterfaceC9483e) this.f32780e).mo2225interface(str);
    }

    public boolean smaato(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        C5170e c5170e = (C5170e) this.f32780e;
        if (c5170e == null) {
            return purchase();
        }
        c5170e.getClass();
        char c = 2;
        for (int i2 = 0; i2 < i && c == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            C16722e c16722e = AbstractC17379e.ad;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                            break;
                        default:
                            c = 2;
                            break;
                    }
                }
                c = 0;
            }
            c = 1;
        }
        if (c == 0) {
            return true;
        }
        if (c != 1) {
            return purchase();
        }
        return false;
    }

    public int startapp() {
        int bitLength = (((C7362e) this.f32780e).f15093e.bitLength() + 7) / 8;
        return this.f32781e ? bitLength : bitLength - 1;
    }

    public void subscription(long j) {
        ((InterfaceC9483e) this.f32780e).writeLong(j);
    }

    public BigInteger tapsense(BigInteger bigInteger) {
        C16043e c16043e;
        BigInteger bigInteger2;
        C7362e c7362e = (C7362e) this.f32780e;
        if (!(c7362e instanceof C16043e) || ((bigInteger2 = (c16043e = (C16043e) c7362e).f31606e) == null && !AbstractC0361e.metrica("org.bouncycastle.rsa.no_lenstra_check"))) {
            C7362e c7362e2 = (C7362e) this.f32780e;
            return bigInteger.modPow(c7362e2.f15092e, c7362e2.f15093e);
        }
        BigInteger bigInteger3 = c16043e.f31605e;
        BigInteger bigInteger4 = c16043e.f31602e;
        BigInteger bigInteger5 = c16043e.f31604e;
        BigInteger bigInteger6 = c16043e.f31601e;
        BigInteger bigInteger7 = c16043e.f31603e;
        BigInteger modPow = bigInteger.remainder(bigInteger3).modPow(bigInteger5, bigInteger3);
        BigInteger modPow2 = bigInteger.remainder(bigInteger4).modPow(bigInteger6, bigInteger4);
        BigInteger add = modPow.subtract(modPow2).multiply(bigInteger7).mod(bigInteger3).multiply(bigInteger4).add(modPow2);
        if (bigInteger2 == null || add.modPow(bigInteger2, c16043e.f15093e).equals(bigInteger)) {
            return add;
        }
        throw new IllegalStateException("RSA engine faulty decryption/signing detected");
    }

    public String toString() {
        switch (this.f32782e) {
            case 6:
                return this.f32781e ? "FALL_THROUGH" : String.valueOf(this.f32780e);
            case 10:
                StringBuilder sb = new StringBuilder();
                sb.append((int) ((((long[]) this.f32780e)[1] >>> 56) & 63));
                sb.append(" first: ");
                sb.append((((long[]) this.f32780e)[1] & 4611686018427387904L) != 0);
                sb.append(", final: ");
                sb.append((((long[]) this.f32780e)[1] & Long.MIN_VALUE) != 0);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC9250e
    public void vip(C16756e c16756e, int i) {
        StringBuilder sb = (StringBuilder) this.f32780e;
        if (this.f32781e) {
            this.f32781e = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    public int yandex() {
        int bitLength = (((C7362e) this.f32780e).f15093e.bitLength() + 7) / 8;
        return this.f32781e ? bitLength - 1 : bitLength;
    }
}
