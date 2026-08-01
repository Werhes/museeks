package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.graphics.Region;
import android.media.browse.MediaBrowser;
import android.os.Build;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.preference.PreferenceManager;
import android.service.media.MediaBrowserService;
import android.util.Size;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.Socket;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؔؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2362e implements InterfaceC2062e, InterfaceC9365e, InterfaceC9729e, InterfaceC5617e, InterfaceC3696e, InterfaceC13363e, InterfaceC2295e, InterfaceC8493e, InterfaceC10625e, InterfaceC12646e, InterfaceC3934e, InterfaceC14020e, InterfaceC16100e, InterfaceC12765e, InterfaceC2556e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static volatile C2362e f5912e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final Object f5913e = new Object();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f5914e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5915e;

    public C2362e(int i) {
        this.f5915e = i;
        switch (i) {
            case 8:
                TimeUnit timeUnit = TimeUnit.MINUTES;
                this.f5914e = new C16389e(C14899e.advert);
                return;
            case 11:
                this.f5914e = (SmallDisplaySizeQuirk) AbstractC16338e.ad(SmallDisplaySizeQuirk.class);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C13245e c13245e = new C13245e();
                this.f5914e = c13245e;
                if (c13245e.f26276e) {
                    return;
                }
                if (c13245e.f26275e) {
                    AbstractC0143e.ad("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                }
                c13245e.ad();
                c13245e.f26275e = true;
                return;
            case 20:
                this.f5914e = new C1292e();
                return;
            case 22:
                this.f5914e = new C2692e((Object) null);
                return;
            case 23:
                this.f5914e = new Object();
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                this.f5914e = new Region();
                return;
            default:
                this.f5914e = r3;
                String[] strArr = {"Other", "32x32 pixels 'file icon' (PNG only)", "Other file icon", "Cover (front)", "Cover (back)", "Leaflet page", "Media (e.g. label side of CD)", "Lead artist/lead performer/soloist", "Artist/performer", "Conductor", "Band/Orchestra", "Composer", "Lyricist/text writer", "Recording Location", "During recording", "During performance", "Movie/video screen capture", "A bright coloured fish", "Illustration", "Band/artist logotype", "Publisher/Studio logotype"};
                return;
        }
    }

    public /* synthetic */ C2362e(int i, Object obj) {
        this.f5915e = i;
        this.f5914e = obj;
    }

    public /* synthetic */ C2362e(int i, boolean z) {
        this.f5915e = i;
    }

    public C2362e(TextView textView) {
        this.f5915e = 12;
        this.f5914e = new C1391e(textView);
    }

    public C2362e(C4069e c4069e) {
        this.f5915e = 27;
        this.f5914e = c4069e;
        C14326e c14326e = InterfaceC7775e.f15760e;
        Class cls = (Class) c4069e.smaato(c14326e, null);
        if (cls != null && !cls.equals(C14402e.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        c4069e.yandex(InterfaceC12438e.f24886e, EnumC12633e.f25347e);
        c4069e.yandex(c14326e, C14402e.class);
        C14326e c14326e2 = InterfaceC7775e.f15761e;
        if (c4069e.smaato(c14326e2, null) == null) {
            c4069e.yandex(c14326e2, C14402e.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    public C2362e(C14013e c14013e, InterfaceC12424e interfaceC12424e) {
        this.f5915e = 24;
        this.f5914e = c14013e;
        interfaceC12424e.purchase();
    }

    public C2362e(C14461e c14461e) {
        this.f5915e = 1;
        Context context = (Context) c14461e.f28587e;
        String str = (String) c14461e.f28589e;
        String str2 = (String) c14461e.f28586e;
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        if (str2 == null) {
            PreferenceManager.getDefaultSharedPreferences(applicationContext).edit();
        } else {
            applicationContext.getSharedPreferences(str2, 0).edit();
        }
        this.f5914e = (C12916e) c14461e.f28590e;
    }

    /* renamed from: const, reason: not valid java name */
    public static C2362e m809const() {
        if (f5912e == null) {
            synchronized (C2362e.class) {
                try {
                    if (f5912e == null) {
                        f5912e = new C2362e(0);
                    }
                } finally {
                }
            }
        }
        return f5912e;
    }

    @Override // defpackage.InterfaceC2556e
    public FileChannel adcel() {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.f5914e;
        if (parcelFileDescriptor.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
        }
        parcelFileDescriptor.close();
        throw new IllegalArgumentException("Not a file: " + parcelFileDescriptor);
    }

    @Override // defpackage.InterfaceC12330e
    public /* synthetic */ Set admob() {
        return AbstractC0054e.smaato(this);
    }

    @Override // defpackage.InterfaceC13363e
    public int billing() {
        return ((ExtendedFloatingActionButton) this.f5914e).f874e;
    }

    @Override // defpackage.InterfaceC12330e
    /* renamed from: catch, reason: not valid java name */
    public /* synthetic */ EnumC13734e mo810catch(C14326e c14326e) {
        return AbstractC0054e.yandex(this, c14326e);
    }

    /* renamed from: continue, reason: not valid java name */
    public void m811continue(InterfaceC13352e interfaceC13352e) {
        Object obj = this.f5914e;
        if (AbstractC7890e.billing(obj, interfaceC13352e)) {
            this.f5914e = null;
            return;
        }
        if (obj instanceof C12618e) {
            C12618e c12618e = (C12618e) obj;
            c12618e.smaato(interfaceC13352e);
            int i = c12618e.license;
            if (i == 0) {
                this.f5914e = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f5914e = c12618e.purchase();
            }
        }
    }

    @Override // defpackage.InterfaceC12330e
    /* renamed from: extends, reason: not valid java name */
    public /* synthetic */ boolean mo812extends(C14326e c14326e) {
        return AbstractC0054e.purchase(this, c14326e);
    }

    /* renamed from: eًًؓ, reason: contains not printable characters */
    public void m813e(C10163e c10163e) {
        ((Region) this.f5914e).set(c10163e.ad, c10163e.vip, c10163e.metrica, c10163e.license);
    }

    /* renamed from: eؙٟ٘, reason: contains not printable characters */
    public void m814e(Object obj) {
        MediaBrowserService.Result result = (MediaBrowserService.Result) this.f5914e;
        if (!(obj instanceof List)) {
            if (!(obj instanceof Parcel)) {
                result.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        List<Parcel> list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        for (Parcel parcel2 : list) {
            parcel2.setDataPosition(0);
            arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
        }
        result.sendResult(arrayList);
    }

    @Override // defpackage.InterfaceC12765e
    /* renamed from: final */
    public void mo213final(C0560e c0560e) {
        Exception startapp = c0560e.startapp();
        if (startapp != null) {
            ((C13578e) this.f5914e).billing(new C12763e(startapp));
        } else if (c0560e.license) {
            ((C13578e) this.f5914e).ad(null);
        } else {
            ((C13578e) this.f5914e).billing(c0560e.adcel());
        }
    }

    /* renamed from: finally, reason: not valid java name */
    public void m815finally() {
        Socket socket;
        C16389e c16389e = (C16389e) this.f5914e;
        Iterator it = ((ConcurrentLinkedQueue) c16389e.f32195e).iterator();
        while (it.hasNext()) {
            C0177e c0177e = (C0177e) it.next();
            synchronized (c0177e) {
                if (c0177e.Signature.isEmpty()) {
                    it.remove();
                    c0177e.adcel = true;
                    socket = c0177e.appmetrica;
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                AbstractC16286e.metrica(socket);
            }
        }
        if (((ConcurrentLinkedQueue) c16389e.f32195e).isEmpty()) {
            ((C10497e) c16389e.f32194e).ad();
        }
    }

    /* renamed from: for, reason: not valid java name */
    public C12309e m816for(C11883e c11883e, ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e) {
        int i;
        long m1706this;
        long j;
        boolean z;
        C2692e c2692e = (C2692e) this.f5914e;
        C2692e c2692e2 = new C2692e(((List) c11883e.f23815e).size());
        List list = (List) c11883e.f23815e;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            C13567e c13567e = (C13567e) list.get(i2);
            long j2 = c13567e.ad;
            C14025e c14025e = (C14025e) c2692e.license(j2);
            if (c14025e == null) {
                i = i2;
                j = c13567e.vip;
                m1706this = c13567e.license;
                z = false;
            } else {
                long j3 = c14025e.ad;
                boolean z2 = c14025e.metrica;
                i = i2;
                m1706this = viewTreeObserverOnGlobalLayoutListenerC5014e.m1706this(c14025e.vip);
                j = j3;
                z = z2;
            }
            long j4 = c13567e.ad;
            List list2 = list;
            int i3 = size;
            c2692e2.yandex(j4, new C2401e(j4, c13567e.vip, c13567e.license, c13567e.appmetrica, c13567e.purchase, j, m1706this, z, c13567e.billing, c13567e.startapp, c13567e.adcel, c13567e.mopub, c13567e.advert, c13567e.smaato));
            boolean z3 = c13567e.appmetrica;
            if (z3) {
                c2692e.yandex(j2, new C14025e(c13567e.vip, c13567e.metrica, z3));
            } else {
                c2692e.startapp(j2);
            }
            i2 = i + 1;
            list = list2;
            size = i3;
        }
        return new C12309e(c2692e2, c11883e, 10);
    }

    @Override // defpackage.InterfaceC2062e
    public String getValue(int i) {
        String str;
        return (mo269instanceof(i) && (str = ((String[]) this.f5914e)[i]) != null) ? str : BuildConfig.FLAVOR;
    }

    @Override // defpackage.InterfaceC13363e
    public int getWidth() {
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.f5914e;
        return (extendedFloatingActionButton.getMeasuredWidth() - (extendedFloatingActionButton.getCollapsedPadding() * 2)) + extendedFloatingActionButton.f873e + extendedFloatingActionButton.f874e;
    }

    @Override // defpackage.InterfaceC13363e
    /* renamed from: goto, reason: not valid java name */
    public ViewGroup.LayoutParams mo817goto() {
        return new ViewGroup.LayoutParams(-2, -2);
    }

    @Override // defpackage.InterfaceC14020e
    /* renamed from: import, reason: not valid java name */
    public List mo818import(C14677e c14677e) {
        C13047e ad = ((C14013e) this.f5914e).ad(c14677e);
        return ad != null ? new ArrayList(ad.ad.keySet()) : C13664e.f27089e;
    }

    @Override // defpackage.InterfaceC12330e
    public /* synthetic */ Set inmobi(C14326e c14326e) {
        return AbstractC0054e.startapp(this, c14326e);
    }

    @Override // defpackage.InterfaceC2062e
    /* renamed from: instanceof */
    public boolean mo269instanceof(int i) {
        return i >= 0 && i <= 20;
    }

    @Override // defpackage.InterfaceC16100e
    /* renamed from: interface, reason: not valid java name */
    public InterfaceC12438e mo819interface() {
        return new C10413e(C17015e.vip((C4069e) this.f5914e));
    }

    @Override // defpackage.InterfaceC18242e
    public InterfaceC13659e isVip() {
        return (C4069e) this.f5914e;
    }

    @Override // defpackage.InterfaceC2295e
    public void license(Object obj) {
        C7169e c7169e = (C7169e) this.f5914e;
        try {
            c7169e.ad(obj);
        } catch (Throwable th) {
            c7169e.metrica(th);
        }
    }

    @Override // defpackage.InterfaceC12330e
    public void metrica(C11565e c11565e) {
        mopub().metrica(c11565e);
    }

    @Override // defpackage.InterfaceC9729e
    public InterfaceC12330e mopub() {
        return (InterfaceC12330e) this.f5914e;
    }

    @Override // defpackage.InterfaceC13363e
    /* renamed from: new, reason: not valid java name */
    public int mo820new() {
        return ((ExtendedFloatingActionButton) this.f5914e).f873e;
    }

    @Override // defpackage.InterfaceC3696e
    /* renamed from: package, reason: not valid java name */
    public InterfaceC5827e mo821package(C2532e c2532e) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && ((context = (Context) this.f5914e) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new C10659e(10).mo821package(c2532e);
        }
        int yandex = AbstractC8542e.yandex(((C16975e) c2532e.f6385e).loadAd);
        AbstractC2803e.advert("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + AbstractC9413e.m2558native(yandex));
        C12309e c12309e = new C12309e(new C12237e(yandex, 0), new C12237e(yandex, 1));
        c12309e.f24694e = true;
        return c12309e.mo821package(c2532e);
    }

    @Override // defpackage.InterfaceC12330e
    public /* synthetic */ Object premium(C14326e c14326e, EnumC13734e enumC13734e) {
        return AbstractC0054e.admob(this, c14326e, enumC13734e);
    }

    @Override // defpackage.InterfaceC3934e
    public C17985e pro(C17985e c17985e, float f, C7695e c7695e) {
        ((C14590e) this.f5914e).pro(c17985e, f, c7695e);
        return c17985e;
    }

    /* renamed from: public, reason: not valid java name */
    public Object m822public(InterfaceC0888e interfaceC0888e, Function0 function0) {
        C5318e c5318e;
        InterfaceC15080e interfaceC15080e;
        int i;
        if (((AbstractC1776e) this.f5914e) == null) {
            AbstractC6536e.vip("Called runAndWatch on a manager that has been disposed of");
        }
        AbstractC1776e abstractC1776e = (AbstractC1776e) this.f5914e;
        if ((abstractC1776e instanceof C5318e) && (interfaceC15080e = (c5318e = (C5318e) abstractC1776e).purchase) != null && !interfaceC15080e.equals(interfaceC0888e)) {
            C0106e c0106e = new C0106e();
            InterfaceC15080e interfaceC15080e2 = c5318e.purchase;
            if (interfaceC15080e2 == null) {
                AbstractC6536e.vip("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            C12618e c12618e = c5318e.license;
            ArrayList arrayList = c0106e.metrica;
            if (c12618e == null) {
                arrayList.add(new C1491e(interfaceC15080e2, c5318e.vip));
            } else {
                Object[] objArr = c12618e.vip;
                long[] jArr = c12618e.ad;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8;
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((j & 255) < 128) {
                                    i = i3;
                                    arrayList.add(new C1491e(interfaceC15080e2, objArr[(i2 << 3) + i5]));
                                } else {
                                    i = i3;
                                }
                                j >>= i;
                                i5++;
                                i3 = i;
                            }
                            if (i4 != i3) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            c0106e.vip();
            c5318e.metrica();
            this.f5914e = c0106e;
        }
        AbstractC1776e abstractC1776e2 = (AbstractC1776e) this.f5914e;
        AbstractC13717e signatures = AbstractC12909e.adcel().signatures(abstractC1776e2.license(interfaceC0888e));
        abstractC1776e2.ad(interfaceC0888e);
        try {
            AbstractC13717e adcel = signatures.adcel();
            try {
                Object invoke = function0.invoke();
                signatures.metrica();
                abstractC1776e2.vip();
                return invoke;
            } finally {
                AbstractC13717e.admob(adcel);
            }
        } catch (Throwable th) {
            signatures.metrica();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC14020e
    public Size purchase(C18525e c18525e, C14677e c14677e) {
        C1296e vip;
        C13047e ad = ((C14013e) this.f5914e).ad(c14677e);
        if (ad == null || (vip = ad.vip(c18525e)) == null) {
            return null;
        }
        return vip.purchase.ad();
    }

    @Override // defpackage.InterfaceC10625e
    public /* synthetic */ void reset() {
    }

    @Override // defpackage.InterfaceC12330e
    public /* synthetic */ Object smaato(C14326e c14326e, Object obj) {
        return AbstractC0054e.Signature(this, c14326e, obj);
    }

    @Override // defpackage.InterfaceC5617e
    public AbstractC9027e subs(ByteArrayInputStream byteArrayInputStream) {
        C3236e c3236e = (C3236e) this.f5914e;
        int bitLength = (c3236e.f7367e.bitLength() + 7) / 8;
        byte[] bArr = new byte[bitLength];
        AbstractC9460e.license(byteArrayInputStream, bArr, 0, bitLength);
        return new C2149e(new BigInteger(1, bArr), c3236e);
    }

    @Override // defpackage.InterfaceC12330e
    public /* synthetic */ Object subscription(C14326e c14326e) {
        return AbstractC0054e.loadAd(this, c14326e);
    }

    @Override // defpackage.InterfaceC10625e
    /* renamed from: this, reason: not valid java name */
    public /* synthetic */ InterfaceC11455e mo823this(int i, int i2, byte[] bArr) {
        return AbstractC1786e.billing(this, bArr, i2);
    }

    /* renamed from: throws, reason: not valid java name */
    public void m824throws(InterfaceC13352e interfaceC13352e) {
        Object obj = this.f5914e;
        if (obj == null) {
            this.f5914e = interfaceC13352e;
            return;
        }
        if (obj instanceof C12618e) {
            ((C12618e) obj).ad(interfaceC13352e);
            return;
        }
        if (obj.equals(interfaceC13352e)) {
            return;
        }
        C12618e c12618e = AbstractC1710e.ad;
        C12618e c12618e2 = new C12618e(2);
        c12618e2.advert((InterfaceC13352e) obj);
        c12618e2.advert(interfaceC13352e);
        this.f5914e = c12618e2;
    }

    public String toString() {
        switch (this.f5915e) {
            case 2:
                return "ResolvedFeatureGroup(features=" + ((LinkedHashSet) this.f5914e) + ')';
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.f5914e).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC10625e
    /* renamed from: transient, reason: not valid java name */
    public void mo825transient(byte[] bArr, int i, int i2, C14033e c14033e, InterfaceC8427e interfaceC8427e) {
        C17817e ad;
        C1292e c1292e = (C1292e) this.f5914e;
        c1292e.m570throw(i + i2, bArr);
        c1292e.m571try(i);
        ArrayList arrayList = new ArrayList();
        while (c1292e.ad() > 0) {
            AbstractC2301e.yandex(c1292e.ad() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int smaato = c1292e.smaato();
            if (c1292e.smaato() == 1987343459) {
                int i3 = smaato - 8;
                CharSequence charSequence = null;
                C4715e c4715e = null;
                while (i3 > 0) {
                    AbstractC2301e.yandex(i3 >= 8, "Incomplete vtt cue box header found.");
                    int smaato2 = c1292e.smaato();
                    int smaato3 = c1292e.smaato();
                    int i4 = smaato2 - 8;
                    byte[] bArr2 = c1292e.ad;
                    int i5 = c1292e.vip;
                    String str = AbstractC9413e.ad;
                    String str2 = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    c1292e.m568protected(i4);
                    i3 = (i3 - 8) - i4;
                    if (smaato3 == 1937011815) {
                        C5932e c5932e = new C5932e();
                        AbstractC10259e.appmetrica(str2, c5932e);
                        c4715e = c5932e.ad();
                    } else if (smaato3 == 1885436268) {
                        charSequence = AbstractC10259e.purchase(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = BuildConfig.FLAVOR;
                }
                if (c4715e != null) {
                    c4715e.ad = charSequence;
                    c4715e.vip = null;
                    ad = c4715e.ad();
                } else {
                    Pattern pattern = AbstractC10259e.ad;
                    C5932e c5932e2 = new C5932e();
                    c5932e2.metrica = charSequence;
                    ad = c5932e2.ad().ad();
                }
                arrayList.add(ad);
            } else {
                c1292e.m568protected(smaato - 8);
            }
        }
        interfaceC8427e.accept(new C17169e(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override // defpackage.InterfaceC13363e
    public int vip() {
        return ((ExtendedFloatingActionButton) this.f5914e).getMeasuredHeight();
    }

    /* renamed from: volatile, reason: not valid java name */
    public synchronized C17424e m826volatile() {
        return ((C12916e) this.f5914e).isPro();
    }

    @Override // defpackage.InterfaceC2295e
    public void yandex(Throwable th) {
        ((C7169e) this.f5914e).metrica(th);
    }
}
