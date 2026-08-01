package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import android.view.Choreographer;
import android.view.View;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12344e implements InterfaceC2227e, InterfaceC14610e, InterfaceC6045e, InterfaceC2839e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f24748e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f24749e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public boolean f24750e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f24751e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f24752e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f24753e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C14829e f24747e = new C14829e(1);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final short[] f24746e = {163, 215, 9, 131, 248, 72, 246, 244, 179, 33, 21, 120, 153, 177, 175, 249, 231, 45, 77, 138, 206, 76, 202, 46, 82, 149, 217, 30, 78, 56, 68, 40, 10, 223, 2, 160, 23, 241, 96, 104, 18, 183, 122, 195, 233, 250, 61, 83, 150, 132, 107, 186, 242, 99, 154, 25, 124, 174, 229, 245, 247, 22, 106, 162, 57, 182, 123, 15, 193, 147, 129, 27, 238, 180, 26, 234, 208, 145, 47, 184, 85, 185, 218, 133, 63, 65, 191, 224, 90, 88, 128, 95, 102, 11, 216, 144, 53, 213, 192, 167, 51, 6, 101, 105, 69, 0, 148, 86, 109, 152, 155, 118, 151, 252, 178, 194, 176, 254, 219, 32, 225, 235, 214, 228, 221, 71, 74, 29, 66, 237, 158, 110, 73, 60, 205, 67, 39, 210, 7, 212, 222, 199, 103, 24, 137, 203, 48, 31, 141, 198, 143, 170, 200, 116, 220, 201, 93, 92, 49, 164, 112, 136, 97, 44, 159, 13, 43, 135, 80, 130, 84, 100, 38, 125, 3, 64, 52, 75, 28, 115, 209, 196, 253, 59, 204, 251, 127, 171, 230, 62, 91, 165, 173, 4, 35, 156, 20, 81, 34, 240, 41, 121, 113, 126, 255, 140, 14, 226, 12, 239, 188, 114, 117, 111, 55, 161, 236, 211, 142, 98, 139, 134, 16, 232, 8, 119, 17, 190, 146, 79, 36, 197, 50, 54, 157, 207, 243, 166, 187, 172, 94, 108, 169, 19, 87, 37, 181, 227, 189, 168, 58, 1, 5, 89, 42, 70};

    public C12344e(int i) {
        this.f24752e = i;
        switch (i) {
            case 4:
                return;
            case 8:
                this.f24749e = new C11993e(4);
                this.f24751e = new C12718e();
                this.f24748e = C3295e.f7451e;
                return;
            case 9:
                C5837e c5837e = new C5837e(Choreographer.getInstance());
                this.f24749e = new HashMap();
                this.f24751e = new CopyOnWriteArraySet();
                this.f24753e = new CopyOnWriteArraySet();
                this.f24750e = true;
                this.f24748e = c5837e;
                c5837e.ad = this;
                return;
            default:
                ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eؑۡؕ, java.lang.Object] */
    public C12344e(Context context, C3098e c3098e, C17856e c17856e) {
        this.f24752e = 13;
        ?? obj = new Object();
        this.f24751e = obj;
        this.f24749e = context;
        obj.f2843e = c3098e.ad;
        this.f24748e = c17856e;
    }

    public C12344e(C0624e c0624e) {
        this.f24752e = 2;
        this.f24749e = new WeakReference(c0624e);
        this.f24751e = new C10733e(this, c0624e);
        this.f24748e = new ComponentCallbacks2C15499e(1, this);
    }

    public C12344e(InterfaceC1272e interfaceC1272e, C16975e c16975e, C8010e c8010e, InterfaceC7854e interfaceC7854e, boolean z) {
        this.f24752e = 0;
        this.f24749e = interfaceC1272e;
        this.f24751e = c16975e;
        this.f24748e = c8010e;
        this.f24753e = interfaceC7854e;
        this.f24750e = z;
    }

    public C12344e(C10228e c10228e, C12434e c12434e) {
        this.f24752e = 14;
        this.f24750e = false;
        C10228e.premium().equals(c10228e);
        this.f24749e = c10228e.signatures();
        this.f24751e = c10228e.tapsense();
        int i = AbstractC12614e.f25334e;
        Object[] objArr = C4477e.f9680e;
        int applovin = c10228e.applovin() + 3;
        AbstractC17595e.metrica(applovin, "expectedSize");
        Csuper csuper = new Csuper(applovin);
        for (C5254e c5254e : c10228e.isPro()) {
            int m1843goto = c5254e.m1843goto();
            int i2 = m1843goto - 1;
            if (m1843goto == 0) {
                throw null;
            }
            if (i2 == 0) {
                csuper.mo3904implements(c5254e.signatures(), Long.valueOf(c5254e.tapsense()));
            } else if (i2 == 1) {
                csuper.mo3904implements(c5254e.signatures(), Boolean.valueOf(c5254e.isVip()));
            } else if (i2 == 2) {
                csuper.mo3904implements(c5254e.signatures(), Double.valueOf(c5254e.inmobi()));
            } else if (i2 == 3) {
                csuper.mo3904implements(c5254e.signatures(), c5254e.isPro());
            } else if (i2 == 4) {
                csuper.mo3904implements(c5254e.signatures(), c5254e.applovin().admob());
            }
        }
        csuper.mo3904implements("__phenotype_server_token", c10228e.isVip());
        csuper.mo3904implements("__phenotype_snapshot_token", c10228e.signatures());
        csuper.mo3904implements("__phenotype_configuration_version", Long.valueOf(c10228e.inmobi()));
        this.f24748e = csuper.mopub(false);
        this.f24753e = c12434e;
    }

    public C12344e(C11467e c11467e, List list, List list2, boolean z, InterfaceC8850e interfaceC8850e) {
        this.f24752e = 10;
        this.f24749e = c11467e;
        this.f24751e = list;
        this.f24748e = list2;
        this.f24750e = z;
        if (this.f24750e && !((List) this.f24748e).isEmpty()) {
            interfaceC8850e = interfaceC8850e.mo394const(C7526e.f15353e);
        }
        this.f24753e = interfaceC8850e;
    }

    public C12344e(C13915e c13915e) {
        this.f24752e = 7;
        this.f24749e = c13915e;
        this.f24751e = new C10780e((C14747e) c13915e.f27592e.license);
        this.f24748e = new C2362e(22);
        this.f24753e = new C2106e();
    }

    public C12344e(C15293e c15293e) {
        this.f24752e = 6;
        this.f24749e = c15293e;
        this.f24748e = new ArrayList();
        this.f24753e = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x029e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C12344e(defpackage.C17841e r32, defpackage.C12434e r33) {
        /*
            Method dump skipped, instructions count: 923
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12344e.<init>(eؙ٘ٚ, eًّّ):void");
    }

    public C12344e(File file) {
        this.f24752e = 3;
        this.f24749e = null;
        this.f24751e = null;
        this.f24748e = new C13391e(file);
    }

    public C12344e(String str, String str2, String str3, List list, boolean z) {
        this.f24752e = 11;
        this.f24750e = z;
        this.f24749e = str;
        this.f24751e = str2;
        this.f24748e = str3;
        this.f24753e = list;
    }

    public C12344e(boolean z, Function0 function0) {
        this.f24752e = 12;
        this.f24750e = z;
        this.f24749e = function0;
        this.f24751e = AbstractC7111e.ad(0.0f);
        this.f24748e = new ArrayList();
    }

    public C12344e(byte[] bArr) {
        this.f24752e = 5;
        this.f24749e = new C15236e(2);
        if (bArr == null) {
            throw new NullPointerException("'context' cannot be null");
        }
        this.f24751e = AbstractC12442e.license(bArr);
    }

    public static C15514e inmobi(int i, DataInputStream dataInputStream) {
        C4660e license;
        int readInt = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        if (i < 2) {
            long readLong = dataInputStream.readLong();
            C18540e c18540e = new C18540e(12);
            c18540e.inmobi(Long.valueOf(readLong), "exo_len");
            license = C4660e.metrica.ad(c18540e);
        } else {
            license = C2532e.license(dataInputStream);
        }
        return new C15514e(readInt, readUTF, license);
    }

    public static int signatures(C15514e c15514e, int i) {
        int hashCode = c15514e.vip.hashCode() + (c15514e.ad * 31);
        if (i < 2) {
            long vip = AbstractC13501e.vip(c15514e.appmetrica);
            return (hashCode * 31) + ((int) (vip ^ (vip >>> 32)));
        }
        return c15514e.appmetrica.hashCode() + (hashCode * 31);
    }

    public void Signature() {
        this.f24750e = false;
        ((ArrayList) this.f24748e).clear();
        ArrayList arrayList = (ArrayList) this.f24753e;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            C11268e c11268e = (C11268e) this.f24751e;
            if (c11268e != null) {
                c11268e.f590e.license(intValue, 1, null);
            }
        }
        arrayList.clear();
    }

    @Override // defpackage.InterfaceC2839e
    public ArrayList ad(C15444e c15444e) {
        C5053e[] c5053eArr;
        if (((C4892e) this.f24753e) == null) {
            startapp();
        }
        C4892e c4892e = (C4892e) this.f24753e;
        if (c4892e == null) {
            throw new C15745e("Error initializing the legacy barcode scanner.", 14);
        }
        C5141e c5141e = new C5141e(c15444e.metrica, c15444e.license, 0, AbstractC12220e.yandex(c15444e.appmetrica), 0L);
        try {
            int i = c15444e.purchase;
            if (i == -1) {
                BinderC3838e binderC3838e = new BinderC3838e(c15444e.ad);
                Parcel m4156e = c4892e.m4156e();
                int i2 = AbstractC15518e.ad;
                m4156e.writeStrongBinder(binderC3838e);
                m4156e.writeInt(1);
                c5141e.writeToParcel(m4156e, 0);
                Parcel m4154e = c4892e.m4154e(m4156e, 2);
                C5053e[] c5053eArr2 = (C5053e[]) m4154e.createTypedArray(C5053e.CREATOR);
                m4154e.recycle();
                c5053eArr = c5053eArr2;
            } else if (i == 17) {
                c5053eArr = c4892e.m1676e(new BinderC3838e(null), c5141e);
            } else if (i == 35) {
                Image.Plane[] ad = c15444e.ad();
                AbstractC9528e.startapp(ad);
                c5141e.f11021e = ad[0].getRowStride();
                c5053eArr = c4892e.m1676e(new BinderC3838e(ad[0].getBuffer()), c5141e);
            } else {
                if (i != 842094169) {
                    throw new C15745e("Unsupported image format: " + c15444e.purchase, 3);
                }
                c5053eArr = c4892e.m1676e(new BinderC3838e(AbstractC11815e.startapp(c15444e)), c5141e);
            }
            ArrayList arrayList = new ArrayList();
            for (C5053e c5053e : c5053eArr) {
                arrayList.add(new C4896e(new C10182e(c5053e), c15444e.billing));
            }
            return arrayList;
        } catch (RemoteException e) {
            throw new C15745e("Failed to detect with legacy barcode detector", e);
        }
    }

    @Override // defpackage.InterfaceC6045e
    public byte[] adcel() {
        C17565e c17565e;
        if (!this.f24750e || (c17565e = (C17565e) this.f24748e) == null) {
            throw new IllegalStateException("Ed448Signer not initialised for signature generation.");
        }
        return ((C15236e) this.f24749e).purchase(c17565e, (byte[]) this.f24751e);
    }

    public C9412e admob() {
        C9412e c9412e = new C9412e(this);
        HashMap hashMap = (HashMap) this.f24749e;
        String str = c9412e.metrica;
        if (hashMap.containsKey(str)) {
            throw new IllegalArgumentException("spring is already registered");
        }
        hashMap.put(str, c9412e);
        return c9412e;
    }

    public synchronized void ads() {
        try {
            if (this.f24750e) {
                return;
            }
            this.f24750e = true;
            Context context = (Context) this.f24753e;
            if (context != null) {
                ((C10733e) this.f24751e).vip(context);
                context.unregisterComponentCallbacks((ComponentCallbacks2C15499e) this.f24748e);
            }
            ((WeakReference) this.f24749e).clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC14610e
    public void advert(HashMap hashMap) {
        if (this.f24750e) {
            purchase(hashMap);
        }
    }

    @Override // defpackage.InterfaceC14610e
    public void amazon(HashMap hashMap, SparseArray sparseArray) {
        BufferedInputStream bufferedInputStream;
        DataInputStream dataInputStream;
        AbstractC2301e.subscription(!this.f24750e);
        Cipher cipher = (Cipher) this.f24749e;
        C13391e c13391e = (C13391e) this.f24748e;
        File file = (File) c13391e.f26645e;
        File file2 = (File) c13391e.f26645e;
        File file3 = (File) c13391e.f26644e;
        if (file.exists() || file3.exists()) {
            DataInputStream dataInputStream2 = null;
            try {
                if (file3.exists()) {
                    file2.delete();
                    file3.renameTo(file2);
                }
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                dataInputStream = new DataInputStream(bufferedInputStream);
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                int readInt = dataInputStream.readInt();
                if (readInt >= 0 && readInt <= 2) {
                    if ((dataInputStream.readInt() & 1) != 0) {
                        if (cipher != null) {
                            byte[] bArr = new byte[16];
                            dataInputStream.readFully(bArr);
                            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                            try {
                                SecretKeySpec secretKeySpec = (SecretKeySpec) this.f24751e;
                                String str = AbstractC9413e.ad;
                                cipher.init(2, secretKeySpec, ivParameterSpec);
                                dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                            } catch (InvalidAlgorithmParameterException e) {
                                e = e;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e2) {
                                e = e2;
                                throw new IllegalStateException(e);
                            }
                        }
                    }
                    int readInt2 = dataInputStream.readInt();
                    int i = 0;
                    for (int i2 = 0; i2 < readInt2; i2++) {
                        C15514e inmobi = inmobi(readInt, dataInputStream);
                        String str2 = inmobi.vip;
                        hashMap.put(str2, inmobi);
                        sparseArray.put(inmobi.ad, str2);
                        i += signatures(inmobi, readInt);
                    }
                    int readInt3 = dataInputStream.readInt();
                    boolean z = dataInputStream.read() == -1;
                    if (readInt3 == i && z) {
                        AbstractC9413e.yandex(dataInputStream);
                        return;
                    }
                }
                AbstractC9413e.yandex(dataInputStream);
            } catch (IOException unused2) {
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    AbstractC9413e.yandex(dataInputStream2);
                }
                hashMap.clear();
                sparseArray.clear();
                file2.delete();
                file3.delete();
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    AbstractC9413e.yandex(dataInputStream2);
                }
                throw th;
            }
            hashMap.clear();
            sparseArray.clear();
            file2.delete();
            file3.delete();
        }
    }

    public void applovin(AudioTrack audioTrack, int i) {
        ArrayList arrayList = (ArrayList) this.f24753e;
        C15293e c15293e = (C15293e) this.f24749e;
        ArrayList arrayList2 = (ArrayList) this.f24748e;
        if (arrayList2.contains(audioTrack)) {
            arrayList.remove(arrayList2.indexOf(audioTrack));
            arrayList2.remove(audioTrack);
        } else {
            arrayList2.add(audioTrack);
            arrayList.add(Integer.valueOf(i));
        }
        boolean z = this.f24750e;
        int i2 = 0;
        if (z) {
            if (z && arrayList2.isEmpty()) {
                this.f24750e = false;
                c15293e.m3926private();
                return;
            } else {
                if (this.f24750e) {
                    c15293e.m3925package();
                    return;
                }
                return;
            }
        }
        this.f24750e = true;
        c15293e.f30217e = new C13465e(i2, this);
        View view = ((AbstractC3655e) c15293e.f30219e.get(0)).f21115e;
        if (view == null) {
            view = null;
        }
        ((C6559e) view).setEnabled(false);
        C17515e c17515e = c15293e.f30218e;
        if (c17515e == null) {
            c17515e = null;
        }
        AbstractC18491e abstractC18491e = c17515e.yandex;
        if (abstractC18491e == null) {
            abstractC18491e = null;
        }
        C1423e c1423e = (C1423e) abstractC18491e;
        ViewOnClickListenerC0123e viewOnClickListenerC0123e = new ViewOnClickListenerC0123e(7, c15293e);
        C16866e c16866e = c1423e.adcel;
        if (c16866e == null) {
            c16866e = null;
        }
        Drawable drawable = c16866e.getContext().getDrawable(R.drawable.ic_close);
        VKXApplication.Companion companion = VKXApplication.f36531e;
        drawable.setTint(AbstractC15933e.ad(R.attr.reborn_title_color));
        C16866e c16866e2 = c1423e.adcel;
        if (c16866e2 == null) {
            c16866e2 = null;
        }
        c16866e2.setNavigationIcon(drawable);
        C16866e c16866e3 = c1423e.adcel;
        if (c16866e3 == null) {
            c16866e3 = null;
        }
        c16866e3.setNavigationOnClickListener(viewOnClickListenerC0123e);
        c1423e.Signature(new C5207e(c15293e, 3));
        C6977e c6977e = c15293e.f11121e;
        if (c6977e == null) {
            c6977e = null;
        }
        c6977e.setPagingEnabled(false);
        C17515e c17515e2 = c15293e.f30218e;
        (c17515e2 != null ? c17515e2 : null).loadAd(1);
        c15293e.f30216e.appmetrica(true);
        c15293e.m3925package();
    }

    @Override // defpackage.InterfaceC14610e
    public void appmetrica() {
        C13391e c13391e = (C13391e) this.f24748e;
        ((File) c13391e.f26645e).delete();
        ((File) c13391e.f26644e).delete();
    }

    @Override // defpackage.InterfaceC14610e
    public void billing(C15514e c15514e, boolean z) {
        this.f24750e = true;
    }

    @Override // defpackage.InterfaceC2227e
    public String getAlgorithmName() {
        return "SKIPJACK";
    }

    @Override // defpackage.InterfaceC2227e
    public void init(boolean z, InterfaceC3894e interfaceC3894e) {
        switch (this.f24752e) {
            case 1:
                if (!(interfaceC3894e instanceof C14915e)) {
                    throw new IllegalArgumentException(AbstractC8703e.remoteconfig("invalid parameter passed to SKIPJACK init - ", interfaceC3894e));
                }
                byte[] bArr = ((C14915e) interfaceC3894e).f29591e;
                this.f24750e = z;
                this.f24749e = new int[32];
                this.f24751e = new int[32];
                this.f24748e = new int[32];
                this.f24753e = new int[32];
                for (int i = 0; i < 32; i++) {
                    int i2 = i * 4;
                    ((int[]) this.f24749e)[i] = bArr[i2 % 10] & 255;
                    ((int[]) this.f24751e)[i] = bArr[(i2 + 1) % 10] & 255;
                    ((int[]) this.f24748e)[i] = bArr[(i2 + 2) % 10] & 255;
                    ((int[]) this.f24753e)[i] = bArr[(i2 + 3) % 10] & 255;
                }
                if (interfaceC3894e instanceof EnumC0300e) {
                    throw new IllegalArgumentException("params should not be CryptoServicePurpose");
                }
                ((C13246e) AbstractC9915e.appmetrica.get()).getClass();
                return;
            default:
                this.f24750e = z;
                if (interfaceC3894e instanceof C12219e) {
                    interfaceC3894e = ((C12219e) interfaceC3894e).f24537e;
                }
                if (z) {
                    this.f24748e = (C17565e) interfaceC3894e;
                    this.f24753e = null;
                } else {
                    this.f24748e = null;
                    this.f24753e = (C6740e) interfaceC3894e;
                }
                if (interfaceC3894e instanceof EnumC0300e) {
                    throw new IllegalArgumentException("params should not be CryptoServicePurpose");
                }
                AbstractC9915e.ad();
                ((C15236e) this.f24749e).reset();
                return;
        }
    }

    @Override // defpackage.InterfaceC2227e
    public int isPro() {
        return 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int isVip(C11883e c11883e, ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        C10780e c10780e = (C10780e) this.f24751e;
        C2106e c2106e = (C2106e) this.f24753e;
        if (this.f24750e) {
            return 0;
        }
        try {
            this.f24750e = true;
            C12309e m816for = ((C2362e) this.f24748e).m816for(c11883e, viewTreeObserverOnGlobalLayoutListenerC5014e);
            C2692e c2692e = (C2692e) m816for.f24693e;
            int adcel = c2692e.adcel();
            for (int i3 = 0; i3 < adcel; i3++) {
                C2401e c2401e = (C2401e) c2692e.mopub(i3);
                if (!c2401e.license && !c2401e.yandex) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int adcel2 = c2692e.adcel();
            for (int i4 = 0; i4 < adcel2; i4++) {
                C2401e c2401e2 = (C2401e) c2692e.mopub(i4);
                if (objArr != false || AbstractC17957e.metrica(c2401e2)) {
                    ((C13915e) this.f24749e).premium(c2401e2.metrica, (C2106e) this.f24753e, c2401e2.startapp, true);
                    if (!c2106e.f5433e.adcel()) {
                        c10780e.ad(c2401e2.ad, c2106e, AbstractC17957e.metrica(c2401e2));
                        c2106e.clear();
                    }
                }
            }
            boolean vip = c10780e.vip(m816for, z);
            if (!m816for.f24694e) {
                int adcel3 = c2692e.adcel();
                for (int i5 = 0; i5 < adcel3; i5++) {
                    C2401e c2401e3 = (C2401e) c2692e.mopub(i5);
                    if (!C2152e.vip(AbstractC17957e.startapp(c2401e3, true), 0L) && c2401e3.vip()) {
                        i = 1;
                        break;
                    }
                }
            }
            i = 0;
            int adcel4 = c2692e.adcel();
            int i6 = 0;
            while (true) {
                if (i6 >= adcel4) {
                    i2 = 0;
                    break;
                }
                if (((C2401e) c2692e.mopub(i6)).vip()) {
                    i2 = 1;
                    break;
                }
                i6++;
            }
            int i7 = (vip ? 1 : 0) | (i << 1) | (i2 << 2);
            this.f24750e = false;
            return i7;
        } catch (Throwable th) {
            this.f24750e = false;
            throw th;
        }
    }

    public void license(Object obj) {
        synchronized (((C11993e) this.f24749e)) {
            Throwable th = (Throwable) this.f24753e;
            if (th != null) {
                throw new IllegalStateException("Can't process the event due to a previous failure", th);
            }
            ((C12718e) this.f24751e).addLast(obj);
            if (this.f24750e) {
                return;
            }
            this.f24750e = true;
            Unit unit = Unit.INSTANCE;
            subscription();
        }
    }

    public void loadAd(String str) {
        HashMap hashMap = (HashMap) this.f24749e;
        if (str == null) {
            throw new IllegalArgumentException("id is required");
        }
        if (((C9412e) hashMap.get(str)) == null) {
            return;
        }
        C9412e c9412e = (C9412e) hashMap.get(str);
        if (c9412e == null) {
            throw new IllegalArgumentException(AbstractC5087e.m1746extends("springId ", str, " does not reference a registered spring"));
        }
        ((CopyOnWriteArraySet) this.f24751e).add(c9412e);
        if (this.f24750e) {
            this.f24750e = false;
            C5837e c5837e = (C5837e) this.f24748e;
            ChoreographerFrameCallbackC6485e choreographerFrameCallbackC6485e = c5837e.metrica;
            Choreographer choreographer = c5837e.vip;
            if (c5837e.license) {
                return;
            }
            c5837e.license = true;
            c5837e.appmetrica = SystemClock.uptimeMillis();
            choreographer.removeFrameCallback(choreographerFrameCallbackC6485e);
            choreographer.postFrameCallback(choreographerFrameCallbackC6485e);
        }
    }

    @Override // defpackage.InterfaceC2839e
    public void metrica() {
        C4892e c4892e = (C4892e) this.f24753e;
        if (c4892e != null) {
            try {
                c4892e.m4155e(c4892e.m4156e(), 3);
            } catch (RemoteException e) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e);
            }
            this.f24753e = null;
        }
    }

    @Override // defpackage.InterfaceC14610e
    public boolean mopub() {
        C13391e c13391e = (C13391e) this.f24748e;
        return ((File) c13391e.f26645e).exists() || ((File) c13391e.f26644e).exists();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Set, java.lang.Object] */
    public C18070e premium(Function1 function1) {
        synchronized (((C11993e) this.f24749e)) {
            this.f24748e = AbstractC4511e.Signature(this.f24748e, function1);
            Unit unit = Unit.INSTANCE;
        }
        return new C18070e(this, function1, 22);
    }

    public int pro(int i, int i2) {
        int i3 = i2 & 255;
        int i4 = (i2 >> 8) & 255;
        int i5 = ((int[]) this.f24753e)[i] ^ i4;
        short[] sArr = f24746e;
        int i6 = i3 ^ sArr[i5];
        int i7 = i4 ^ sArr[((int[]) this.f24748e)[i] ^ i6];
        int i8 = i6 ^ sArr[((int[]) this.f24751e)[i] ^ i7];
        return ((sArr[((int[]) this.f24749e)[i] ^ i8] ^ i7) << 8) + i8;
    }

    @Override // defpackage.InterfaceC14610e
    public void purchase(HashMap hashMap) {
        DataOutputStream dataOutputStream;
        C13391e c13391e = (C13391e) this.f24748e;
        DataOutputStream dataOutputStream2 = null;
        try {
            C16358e tapsense = c13391e.tapsense();
            C15910e c15910e = (C15910e) this.f24753e;
            if (c15910e == null) {
                this.f24753e = new BufferedOutputStream(tapsense);
            } else {
                c15910e.ad(tapsense);
            }
            dataOutputStream = new DataOutputStream((C15910e) this.f24753e);
        } catch (Throwable th) {
            th = th;
        }
        try {
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(hashMap.size());
            int i = 0;
            for (C15514e c15514e : hashMap.values()) {
                dataOutputStream.writeInt(c15514e.ad);
                dataOutputStream.writeUTF(c15514e.vip);
                C2532e.appmetrica(c15514e.appmetrica, dataOutputStream);
                i += signatures(c15514e, 2);
            }
            dataOutputStream.writeInt(i);
            dataOutputStream.close();
            ((File) c13391e.f26644e).delete();
            String str = AbstractC9413e.ad;
            this.f24750e = false;
        } catch (Throwable th2) {
            th = th2;
            dataOutputStream2 = dataOutputStream;
            AbstractC9413e.yandex(dataOutputStream2);
            throw th;
        }
    }

    public int remoteconfig(int i, int i2) {
        int i3 = (i2 >> 8) & 255;
        int i4 = i2 & 255;
        int i5 = ((int[]) this.f24749e)[i] ^ i4;
        short[] sArr = f24746e;
        int i6 = i3 ^ sArr[i5];
        int i7 = i4 ^ sArr[((int[]) this.f24751e)[i] ^ i6];
        int i8 = i6 ^ sArr[((int[]) this.f24748e)[i] ^ i7];
        return (i8 << 8) + (sArr[((int[]) this.f24753e)[i] ^ i8] ^ i7);
    }

    @Override // defpackage.InterfaceC2227e
    public void reset() {
    }

    @Override // defpackage.InterfaceC14610e
    public void smaato(long j) {
    }

    @Override // defpackage.InterfaceC2839e
    public boolean startapp() {
        IInterface abstractC16277e;
        C17856e c17856e = (C17856e) this.f24748e;
        Context context = (Context) this.f24749e;
        if (((C4892e) this.f24753e) == null) {
            try {
                IBinder vip = C0781e.metrica(context, C0781e.vip, "com.google.android.gms.vision.dynamite").vip("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
                int i = AbstractBinderC7577e.license;
                if (vip == null) {
                    abstractC16277e = null;
                } else {
                    IInterface queryLocalInterface = vip.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                    abstractC16277e = queryLocalInterface instanceof InterfaceC17012e ? (InterfaceC17012e) queryLocalInterface : new AbstractC16277e(vip, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator", 3);
                }
                C4892e m1628e = ((C4404e) abstractC16277e).m1628e(new BinderC3838e(context), (C0622e) this.f24751e);
                this.f24753e = m1628e;
                if (m1628e == null && !this.f24750e) {
                    Log.d("LegacyBarcodeScanner", "Request optional module download.");
                    C1032e[] c1032eArr = AbstractC14014e.ad;
                    C8081e c8081e = AbstractC4354e.f9489e;
                    Object[] objArr = {"barcode"};
                    AbstractC11261e.purchase(1, objArr);
                    AbstractC14014e.ad(context, new C11530e(1, objArr));
                    this.f24750e = true;
                    AbstractC4214e.vip(c17856e, EnumC3305e.OPTIONAL_MODULE_NOT_AVAILABLE);
                    throw new C15745e("Waiting for the barcode module to be downloaded. Please wait.", 14);
                }
                AbstractC4214e.vip(c17856e, EnumC3305e.NO_ERROR);
            } catch (RemoteException e) {
                throw new C15745e("Failed to create legacy barcode detector.", e);
            } catch (C15674e e2) {
                throw new C15745e("Failed to load deprecated vision dynamite module.", e2);
            }
        }
        return false;
    }

    public void subscription() {
        Object removeFirst;
        Object obj;
        while (true) {
            synchronized (((C11993e) this.f24749e)) {
                if (((C12718e) this.f24751e).isEmpty()) {
                    this.f24750e = false;
                    return;
                } else {
                    removeFirst = ((C12718e) this.f24751e).removeFirst();
                    obj = this.f24748e;
                    Unit unit = Unit.INSTANCE;
                }
            }
            try {
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    ((Function1) it.next()).invoke(removeFirst);
                }
            } catch (Throwable th) {
                synchronized (((C11993e) this.f24749e)) {
                    ((C12718e) this.f24751e).clear();
                    this.f24750e = false;
                    this.f24753e = th;
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.InterfaceC2227e
    public int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        if (((int[]) this.f24751e) == null) {
            throw new IllegalStateException("SKIPJACK engine not initialised");
        }
        if (i + 8 > bArr.length) {
            throw new RuntimeException("input buffer too short");
        }
        if (i2 + 8 > bArr2.length) {
            throw new RuntimeException("output buffer too short");
        }
        if (this.f24750e) {
            int i3 = (bArr[i] << 8) + (bArr[i + 1] & 255);
            int i4 = (bArr[i + 2] << 8) + (bArr[i + 3] & 255);
            int i5 = (bArr[i + 4] << 8) + (bArr[i + 5] & 255);
            int i6 = (bArr[i + 6] << 8) + (bArr[i + 7] & 255);
            int i7 = 0;
            for (int i8 = 0; i8 < 2; i8++) {
                int i9 = 0;
                while (i9 < 8) {
                    int remoteconfig = remoteconfig(i7, i3);
                    i7++;
                    i9++;
                    int i10 = i4;
                    i4 = remoteconfig;
                    i3 = (i6 ^ remoteconfig) ^ i7;
                    i6 = i5;
                    i5 = i10;
                }
                int i11 = 0;
                while (i11 < 8) {
                    int i12 = i7 + 1;
                    int i13 = (i4 ^ i3) ^ i12;
                    int remoteconfig2 = remoteconfig(i7, i3);
                    i11++;
                    i3 = i6;
                    i6 = i5;
                    i5 = i13;
                    i4 = remoteconfig2;
                    i7 = i12;
                }
            }
            bArr2[i2] = (byte) (i3 >> 8);
            bArr2[i2 + 1] = (byte) i3;
            bArr2[i2 + 2] = (byte) (i4 >> 8);
            bArr2[i2 + 3] = (byte) i4;
            bArr2[i2 + 4] = (byte) (i5 >> 8);
            bArr2[i2 + 5] = (byte) i5;
            bArr2[i2 + 6] = (byte) (i6 >> 8);
            bArr2[i2 + 7] = (byte) i6;
        } else {
            int i14 = (bArr[i] << 8) + (bArr[i + 1] & 255);
            int i15 = (bArr[i + 2] << 8) + (bArr[i + 3] & 255);
            int i16 = (bArr[i + 4] << 8) + (bArr[i + 5] & 255);
            int i17 = (bArr[i + 6] << 8) + (bArr[i + 7] & 255);
            int i18 = 31;
            for (int i19 = 0; i19 < 2; i19++) {
                int i20 = 0;
                while (i20 < 8) {
                    int pro = pro(i18, i15);
                    int i21 = (i16 ^ pro) ^ (i18 + 1);
                    i18--;
                    i20++;
                    int i22 = i17;
                    i17 = i14;
                    i14 = pro;
                    i15 = i21;
                    i16 = i22;
                }
                int i23 = 0;
                while (i23 < 8) {
                    int i24 = (i14 ^ i15) ^ (i18 + 1);
                    int pro2 = pro(i18, i15);
                    i18--;
                    i23++;
                    int i25 = i17;
                    i17 = i24;
                    i14 = pro2;
                    i15 = i16;
                    i16 = i25;
                }
            }
            bArr2[i2] = (byte) (i14 >> 8);
            bArr2[i2 + 1] = (byte) i14;
            bArr2[i2 + 2] = (byte) (i15 >> 8);
            bArr2[i2 + 3] = (byte) i15;
            bArr2[i2 + 4] = (byte) (i16 >> 8);
            bArr2[i2 + 5] = (byte) i16;
            bArr2[i2 + 6] = (byte) (i17 >> 8);
            bArr2[i2 + 7] = (byte) i17;
        }
        return 8;
    }

    @Override // defpackage.InterfaceC6045e
    public void update(byte b) {
        ((C15236e) this.f24749e).write(b);
    }

    @Override // defpackage.InterfaceC6045e
    public void update(byte[] bArr, int i, int i2) {
        ((C15236e) this.f24749e).write(bArr, i, i2);
    }

    @Override // defpackage.InterfaceC6045e
    public boolean vip(byte[] bArr) {
        C6740e c6740e;
        if (this.f24750e || (c6740e = (C6740e) this.f24753e) == null) {
            throw new IllegalStateException("Ed448Signer not initialised for verification");
        }
        return ((C15236e) this.f24749e).inmobi(c6740e, (byte[]) this.f24751e, bArr);
    }

    @Override // defpackage.InterfaceC14610e
    public void yandex(C15514e c15514e) {
        this.f24750e = true;
    }
}
