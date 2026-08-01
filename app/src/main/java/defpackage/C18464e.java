package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Looper;
import android.text.Layout;
import android.text.TextUtils;
import android.util.Log;
import android.view.SurfaceHolder;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.text.Bidi;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18464e implements InterfaceC15813e, InterfaceC12233e, InterfaceC15374e, InterfaceC15269e, InterfaceC16843e, InterfaceC2560e {

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C11021e f36188e = new C11021e(14);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object f36189e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f36190e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f36191e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public Object f36192e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f36193e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public Object f36194e;

    public C18464e(int i) {
        this.f36193e = i;
        switch (i) {
            case 6:
                this.f36192e = new ArrayList();
                this.f36191e = new ArrayList();
                this.f36190e = new ArrayList();
                this.f36189e = new ArrayList();
                this.f36194e = new ArrayList();
                return;
            case 7:
                C7838e c7838e = VKXApplication.f36530e;
                this.f36191e = AbstractC14533e.startapp((c7838e == null ? null : c7838e).f15868e.license);
                C7838e c7838e2 = VKXApplication.f36530e;
                this.f36190e = AbstractC14533e.startapp((c7838e2 == null ? null : c7838e2).appmetrica());
                C7838e c7838e3 = VKXApplication.f36530e;
                C14609e vip = (c7838e3 == null ? null : c7838e3).vip();
                this.f36192e = AbstractC14533e.startapp(vip != null ? vip.vip : null);
                C7838e c7838e4 = VKXApplication.f36530e;
                c7838e4 = c7838e4 == null ? null : c7838e4;
                c7838e4.getClass();
                this.f36189e = AbstractC14533e.startapp((C14751e) c7838e4.yandex(new C1586e(c7838e4, 13)));
                C7838e c7838e5 = VKXApplication.f36530e;
                C7838e c7838e6 = c7838e5 != null ? c7838e5 : null;
                c7838e6.getClass();
                Boolean bool = (Boolean) c7838e6.yandex(new C1586e(c7838e6, 19));
                bool.booleanValue();
                this.f36194e = AbstractC14533e.startapp(bool);
                return;
            case 10:
                this.f36191e = new int[10];
                this.f36190e = new int[10];
                this.f36192e = new int[10];
                this.f36189e = new int[10];
                this.f36194e = new int[10];
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                this.f36191e = new HashMap();
                this.f36190e = new HashMap();
                this.f36192e = new HashMap();
                this.f36189e = new HashMap();
                this.f36194e = new HashMap();
                return;
            case 23:
                this.f36194e = C5107e.f10949e;
                this.f36190e = "GET";
                this.f36192e = new C15783e(0);
                return;
            default:
                this.f36191e = new Object();
                this.f36192e = new AtomicInteger(0);
                this.f36189e = new C12328e();
                this.f36194e = new C12328e();
                return;
        }
    }

    public /* synthetic */ C18464e(int i, boolean z) {
        this.f36193e = i;
    }

    public C18464e(Context context) {
        this.f36193e = 15;
        this.f36191e = context.getApplicationContext();
        this.f36190e = C13661e.loadAd;
        this.f36192e = null;
        this.f36189e = null;
        this.f36194e = new C9061e();
    }

    public C18464e(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f36193e = 27;
        this.f36189e = new ArrayDeque();
        this.f36191e = sharedPreferences;
        this.f36190e = "topic_operation_queue";
        this.f36192e = ",";
        this.f36194e = scheduledThreadPoolExecutor;
    }

    public C18464e(Layout layout) {
        this.f36193e = 16;
        this.f36191e = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            int m1865interface = AbstractC5304e.m1865interface(((Layout) this.f36191e).getText(), '\n', i, 4);
            i = m1865interface < 0 ? ((Layout) this.f36191e).getText().length() : m1865interface + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < ((Layout) this.f36191e).getText().length());
        this.f36192e = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add(null);
        }
        this.f36190e = arrayList2;
        this.f36189e = new boolean[((ArrayList) this.f36192e).size()];
        ((ArrayList) this.f36192e).size();
    }

    public C18464e(C2098e c2098e, C14874e c14874e) {
        this.f36193e = 19;
        this.f36191e = c2098e;
        this.f36190e = c14874e;
        this.f36192e = AbstractC14430e.metrica(false);
        this.f36189e = AbstractC12501e.ad(Alert.DURATION_SHOW_INDEFINITELY, 0, new C6846e(26, this), 2);
        this.f36194e = new C12718e();
    }

    public C18464e(InterfaceC2881e interfaceC2881e, InterfaceC2881e interfaceC2881e2, InterfaceC13297e interfaceC13297e) {
        this.f36193e = 9;
        this.f36190e = interfaceC2881e;
        this.f36192e = interfaceC2881e2;
        this.f36191e = interfaceC13297e;
    }

    public C18464e(C7259e c7259e, InterfaceC2560e interfaceC2560e) {
        this.f36193e = 24;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<C8625e> set = c7259e.metrica;
        Set set2 = c7259e.billing;
        for (C8625e c8625e : set) {
            int i = c8625e.metrica;
            int i2 = c8625e.vip;
            boolean z = i == 0;
            C16786e c16786e = c8625e.ad;
            if (z) {
                if (i2 == 2) {
                    hashSet4.add(c16786e);
                } else {
                    hashSet.add(c16786e);
                }
            } else if (i == 2) {
                hashSet3.add(c16786e);
            } else if (i2 == 2) {
                hashSet5.add(c16786e);
            } else {
                hashSet2.add(c16786e);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(C16786e.ad(InterfaceC7138e.class));
        }
        this.f36191e = DesugarCollections.unmodifiableSet(hashSet);
        this.f36190e = DesugarCollections.unmodifiableSet(hashSet2);
        this.f36192e = DesugarCollections.unmodifiableSet(hashSet3);
        this.f36189e = DesugarCollections.unmodifiableSet(hashSet4);
        DesugarCollections.unmodifiableSet(hashSet5);
        this.f36194e = interfaceC2560e;
    }

    public C18464e(AbstractC7629e abstractC7629e, byte[] bArr, byte[] bArr2) {
        this.f36193e = 12;
        this.f36191e = bArr;
        this.f36190e = bArr2;
        this.f36192e = abstractC7629e;
        this.f36189e = new C2691e(23, abstractC7629e);
        C13935e c13935e = new C13935e(1);
        c13935e.m3739new(abstractC7629e.purchase - 1);
        c13935e.m3741private(0L);
        if (bArr != null) {
            this.f36194e = m4506e(bArr, 0, abstractC7629e.adcel, bArr2, c13935e);
        } else {
            this.f36194e = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.util.List] */
    public C18464e(C10566e c10566e, C1839e c1839e, List list, InterfaceC14388e interfaceC14388e, InterfaceC2141e interfaceC2141e) {
        int i;
        String str;
        int i2;
        List list2;
        C10566e c10566e2 = c10566e;
        C1839e c1839e2 = c1839e;
        this.f36193e = 18;
        this.f36191e = c10566e2;
        this.f36190e = list;
        final int i3 = 0;
        this.f36189e = AbstractC18039e.appmetrica(3, new Function0(this) { // from class: eٕٓ۟

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C18464e f28195e;

            {
                this.f28195e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i3) {
                    case 0:
                        ArrayList arrayList = (ArrayList) this.f28195e.f36192e;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float yandex = ((C17860e) obj3).ad.yandex();
                            int billing = AbstractC6874e.billing(arrayList);
                            int i4 = 1;
                            if (1 <= billing) {
                                while (true) {
                                    Object obj4 = arrayList.get(i4);
                                    float yandex2 = ((C17860e) obj4).ad.yandex();
                                    if (Float.compare(yandex, yandex2) < 0) {
                                        obj3 = obj4;
                                        yandex = yandex2;
                                    }
                                    if (i4 != billing) {
                                        i4++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        C17860e c17860e = (C17860e) obj;
                        return Float.valueOf(c17860e != null ? c17860e.ad.yandex() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) this.f28195e.f36192e;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float metrica = ((C17860e) obj5).ad.f19539e.metrica();
                            int billing2 = AbstractC6874e.billing(arrayList2);
                            int i5 = 1;
                            if (1 <= billing2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i5);
                                    float metrica2 = ((C17860e) obj6).ad.f19539e.metrica();
                                    if (Float.compare(metrica, metrica2) < 0) {
                                        obj5 = obj6;
                                        metrica = metrica2;
                                    }
                                    if (i5 != billing2) {
                                        i5++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        C17860e c17860e2 = (C17860e) obj2;
                        return Float.valueOf(c17860e2 != null ? c17860e2.ad.f19539e.metrica() : 0.0f);
                }
            }
        });
        final int i4 = 1;
        this.f36194e = AbstractC18039e.appmetrica(3, new Function0(this) { // from class: eٕٓ۟

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C18464e f28195e;

            {
                this.f28195e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Object obj;
                Object obj2;
                switch (i4) {
                    case 0:
                        ArrayList arrayList = (ArrayList) this.f28195e.f36192e;
                        if (arrayList.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList.get(0);
                            float yandex = ((C17860e) obj3).ad.yandex();
                            int billing = AbstractC6874e.billing(arrayList);
                            int i42 = 1;
                            if (1 <= billing) {
                                while (true) {
                                    Object obj4 = arrayList.get(i42);
                                    float yandex2 = ((C17860e) obj4).ad.yandex();
                                    if (Float.compare(yandex, yandex2) < 0) {
                                        obj3 = obj4;
                                        yandex = yandex2;
                                    }
                                    if (i42 != billing) {
                                        i42++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        C17860e c17860e = (C17860e) obj;
                        return Float.valueOf(c17860e != null ? c17860e.ad.yandex() : 0.0f);
                    default:
                        ArrayList arrayList2 = (ArrayList) this.f28195e.f36192e;
                        if (arrayList2.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList2.get(0);
                            float metrica = ((C17860e) obj5).ad.f19539e.metrica();
                            int billing2 = AbstractC6874e.billing(arrayList2);
                            int i5 = 1;
                            if (1 <= billing2) {
                                while (true) {
                                    Object obj6 = arrayList2.get(i5);
                                    float metrica2 = ((C17860e) obj6).ad.f19539e.metrica();
                                    if (Float.compare(metrica, metrica2) < 0) {
                                        obj5 = obj6;
                                        metrica = metrica2;
                                    }
                                    if (i5 != billing2) {
                                        i5++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        C17860e c17860e2 = (C17860e) obj2;
                        return Float.valueOf(c17860e2 != null ? c17860e2.ad.f19539e.metrica() : 0.0f);
                }
            }
        });
        C6191e c6191e = c1839e2.vip;
        C10566e c10566e3 = AbstractC13195e.ad;
        ArrayList arrayList = c10566e2.f20851e;
        String str2 = c10566e2.f20850e;
        C13664e c13664e = C13664e.f27089e;
        List m3577else = arrayList != null ? AbstractC13480e.m3577else(arrayList, new C11021e(10)) : c13664e;
        ArrayList arrayList2 = new ArrayList();
        C12718e c12718e = new C12718e();
        int size = m3577else.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            C9363e c9363e = (C9363e) m3577else.get(i5);
            C9363e ad = C9363e.ad(c9363e, c6191e.ad((C6191e) c9363e.ad), i3, i3, 14);
            Object obj = ad.ad;
            int i7 = ad.metrica;
            int i8 = ad.vip;
            while (i6 < i8 && !c12718e.isEmpty()) {
                C9363e c9363e2 = (C9363e) c12718e.last();
                List list3 = m3577else;
                int i9 = c9363e2.metrica;
                C13664e c13664e2 = c13664e;
                Object obj2 = c9363e2.ad;
                if (i8 < i9) {
                    arrayList2.add(new C9363e(obj2, i6, i8));
                    i6 = i8;
                    m3577else = list3;
                    c13664e = c13664e2;
                } else {
                    int i10 = size;
                    arrayList2.add(new C9363e(obj2, i6, i9));
                    i6 = c9363e2.metrica;
                    while (!c12718e.isEmpty() && i6 == ((C9363e) c12718e.last()).metrica) {
                        c12718e.removeLast();
                    }
                    m3577else = list3;
                    c13664e = c13664e2;
                    size = i10;
                }
            }
            List list4 = m3577else;
            C13664e c13664e3 = c13664e;
            int i11 = size;
            if (i6 < i8) {
                arrayList2.add(new C9363e(c6191e, i6, i8));
                i6 = i8;
            }
            C9363e c9363e3 = (C9363e) c12718e.m3389while();
            if (c9363e3 != null) {
                int i12 = c9363e3.metrica;
                Object obj3 = c9363e3.ad;
                int i13 = c9363e3.vip;
                if (i13 == i8 && i12 == i7) {
                    c12718e.removeLast();
                    c12718e.addLast(new C9363e(((C6191e) obj3).ad((C6191e) obj), i8, i7));
                } else if (i13 == i12) {
                    arrayList2.add(new C9363e(obj3, i13, i12));
                    c12718e.removeLast();
                    c12718e.addLast(new C9363e(obj, i8, i7));
                } else {
                    if (i12 < i7) {
                        throw new IllegalArgumentException();
                    }
                    c12718e.addLast(new C9363e(((C6191e) obj3).ad((C6191e) obj), i8, i7));
                }
            } else {
                c12718e.addLast(new C9363e(obj, i8, i7));
            }
            i5++;
            m3577else = list4;
            c13664e = c13664e3;
            size = i11;
            i3 = 0;
        }
        C13664e c13664e4 = c13664e;
        while (i6 <= str2.length() && !c12718e.isEmpty()) {
            C9363e c9363e4 = (C9363e) c12718e.last();
            Object obj4 = c9363e4.ad;
            int i14 = c9363e4.metrica;
            arrayList2.add(new C9363e(obj4, i6, i14));
            while (!c12718e.isEmpty() && i14 == ((C9363e) c12718e.last()).metrica) {
                c12718e.removeLast();
            }
            i6 = i14;
        }
        if (i6 < str2.length()) {
            arrayList2.add(new C9363e(c6191e, i6, str2.length()));
        }
        if (arrayList2.isEmpty()) {
            i = 0;
            arrayList2.add(new C9363e(c6191e, 0, 0));
        } else {
            i = 0;
        }
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        int size2 = arrayList2.size();
        int i15 = i;
        while (i15 < size2) {
            C9363e c9363e5 = (C9363e) arrayList2.get(i15);
            int i16 = c9363e5.vip;
            int i17 = c9363e5.metrica;
            String substring = i16 != i17 ? str2.substring(i16, i17) : BuildConfig.FLAVOR;
            List ad2 = AbstractC13195e.ad(c10566e2, i16, i17, new C14099e(12));
            C10566e c10566e4 = new C10566e(substring, ad2 == null ? c13664e4 : ad2);
            C6191e c6191e2 = (C6191e) c9363e5.ad;
            if (c6191e2.vip == 0) {
                str = str2;
                i2 = size2;
                c6191e2 = new C6191e(c6191e2.ad, c6191e.vip, c6191e2.metrica, c6191e2.license, c6191e2.appmetrica, c6191e2.purchase, c6191e2.billing, c6191e2.yandex, c6191e2.startapp);
            } else {
                str = str2;
                i2 = size2;
            }
            C1839e c1839e3 = new C1839e(c1839e2.ad, c6191e.ad(c6191e2));
            ?? r5 = c10566e4.f20852e;
            C13664e c13664e5 = r5 == 0 ? c13664e4 : r5;
            List list5 = (List) this.f36190e;
            ArrayList arrayList4 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i18 = 0;
            while (i18 < size3) {
                C9363e c9363e6 = (C9363e) list5.get(i18);
                int i19 = c9363e6.vip;
                C6191e c6191e3 = c6191e;
                int i20 = c9363e6.metrica;
                if (AbstractC13195e.vip(i16, i17, i19, i20)) {
                    if (i16 > i19 || i20 > i17) {
                        AbstractC5525e.ad("placeholder can not overlap with paragraph.");
                    }
                    list2 = list5;
                    arrayList4.add(new C9363e(c9363e6.ad, i19 - i16, i20 - i16));
                } else {
                    list2 = list5;
                }
                i18++;
                list5 = list2;
                c6191e = c6191e3;
            }
            arrayList3.add(new C17860e(new C9904e(substring, c1839e3, c13664e5, arrayList4, interfaceC2141e, interfaceC14388e), i16, i17));
            i15++;
            c10566e2 = c10566e;
            c1839e2 = c1839e;
            str2 = str;
            size2 = i2;
        }
        this.f36192e = arrayList3;
    }

    public C18464e(C11476e c11476e, C8086e c8086e) {
        this.f36193e = 20;
        this.f36191e = c11476e;
        this.f36190e = c8086e;
        this.f36192e = AbstractC14430e.metrica(false);
        this.f36189e = AbstractC12501e.ad(Alert.DURATION_SHOW_INDEFINITELY, 0, new C13749e(2, this), 2);
        this.f36194e = new C12718e();
    }

    public C18464e(C12454e c12454e) {
        this.f36193e = 28;
        this.f36191e = new C6325e(14, c12454e);
        this.f36190e = new C0444e(c12454e);
        this.f36192e = new C15816e(13, c12454e);
        this.f36189e = new C17974e(12, c12454e);
        this.f36194e = new C5389e(14, c12454e);
    }

    public C18464e(C12490e c12490e) {
        this.f36193e = 22;
        this.f36191e = c12490e;
        this.f36190e = new C11689e(27);
        this.f36192e = new ArrayList();
        this.f36194e = new ArrayList();
    }

    public C18464e(C14461e c14461e, C14461e c14461e2, C0520e c0520e, ArrayList arrayList) {
        this.f36193e = 4;
        this.f36190e = c14461e;
        this.f36189e = c14461e2;
        this.f36194e = c0520e;
        this.f36192e = arrayList;
        this.f36191e = c14461e;
    }

    public C18464e(C14826e c14826e, List list) {
        this.f36193e = 14;
        this.f36191e = c14826e;
        this.f36190e = list;
        C1615e metrica = AbstractC9180e.metrica(new C6571e(0, 0));
        this.f36189e = metrica;
        this.f36194e = new C14688e(metrica);
    }

    public C18464e(C14899e c14899e) {
        this.f36193e = 13;
        this.f36191e = c14899e;
        this.f36189e = AbstractC11101e.ad;
        this.f36194e = C14255e.ad;
    }

    public C18464e(C14918e c14918e, VKXApplication vKXApplication, C0063e c0063e, C0063e c0063e2) {
        this.f36193e = 1;
        this.f36191e = c14918e;
        this.f36190e = vKXApplication;
        this.f36192e = c0063e;
        this.f36189e = c0063e2;
        this.f36194e = AbstractC9180e.metrica(null);
        m4503e(vKXApplication, c14918e, c0063e, c0063e2, false);
    }

    public C18464e(C17306e c17306e) {
        this.f36193e = 6;
        this.f36192e = new ArrayList(c17306e.ad);
        this.f36191e = new ArrayList(c17306e.vip);
        this.f36190e = new ArrayList(c17306e.metrica);
        List list = (List) c17306e.purchase.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C10479e(9, (C6571e) it.next()));
        }
        this.f36189e = arrayList;
        List list2 = (List) c17306e.billing.getValue();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new C14536e((InterfaceC11259e) it2.next(), 1));
        }
        this.f36194e = arrayList2;
    }

    public /* synthetic */ C18464e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f36193e = i;
        this.f36191e = obj;
        this.f36190e = obj2;
        this.f36192e = obj3;
        this.f36189e = obj4;
        this.f36194e = obj5;
    }

    public C18464e(Map map) {
        this.f36193e = 25;
        this.f36191e = new LinkedHashMap(map);
        this.f36190e = new LinkedHashMap();
        this.f36192e = new LinkedHashMap();
        this.f36189e = new LinkedHashMap();
        this.f36194e = new C14574e(5, this);
    }

    public /* synthetic */ C18464e(boolean z) {
        this.f36193e = 23;
    }

    public C18464e(int[] iArr, int i, C18256e[] c18256eArr) {
        C12086e c12086e;
        this.f36193e = 0;
        this.f36194e = new float[3];
        this.f36189e = c18256eArr;
        int[] iArr2 = new int[32768];
        this.f36190e = iArr2;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            int m4480e = m4480e(Color.blue(i3), 8, 5) | (m4480e(Color.red(i3), 8, 5) << 10) | (m4480e(Color.green(i3), 8, 5) << 5);
            iArr[i2] = m4480e;
            iArr2[m4480e] = iArr2[m4480e] + 1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < 32768; i5++) {
            if (iArr2[i5] > 0) {
                int rgb = Color.rgb(m4480e((i5 >> 10) & 31, 5, 8), m4480e((i5 >> 5) & 31, 5, 8), m4480e(i5 & 31, 5, 8));
                float[] fArr = (float[]) this.f36194e;
                ThreadLocal threadLocal = AbstractC3898e.ad;
                AbstractC3898e.ad(Color.red(rgb), Color.green(rgb), Color.blue(rgb), fArr);
                if (m4493e(fArr)) {
                    iArr2[i5] = 0;
                }
            }
            if (iArr2[i5] > 0) {
                i4++;
            }
        }
        int[] iArr3 = new int[i4];
        this.f36191e = iArr3;
        int i6 = 0;
        for (int i7 = 0; i7 < 32768; i7++) {
            if (iArr2[i7] > 0) {
                iArr3[i6] = i7;
                i6++;
            }
        }
        if (i4 <= i) {
            this.f36192e = new ArrayList();
            for (int i8 = 0; i8 < i4; i8++) {
                int i9 = iArr3[i8];
                ((ArrayList) this.f36192e).add(new C18075e(Color.rgb(m4480e((i9 >> 10) & 31, 5, 8), m4480e((i9 >> 5) & 31, 5, 8), m4480e(i9 & 31, 5, 8)), iArr2[i9]));
            }
            return;
        }
        PriorityQueue priorityQueue = new PriorityQueue(i, f36188e);
        priorityQueue.offer(new C12086e(this, 0, ((int[]) this.f36191e).length - 1));
        while (priorityQueue.size() < i && (c12086e = (C12086e) priorityQueue.poll()) != null) {
            int i10 = c12086e.vip;
            int i11 = c12086e.ad;
            if ((i10 + 1) - i11 <= 1) {
                break;
            }
            C18464e c18464e = c12086e.adcel;
            if ((i10 + 1) - i11 <= 1) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int i12 = c12086e.appmetrica - c12086e.license;
            int i13 = c12086e.billing - c12086e.purchase;
            int i14 = c12086e.startapp - c12086e.yandex;
            int i15 = (i12 < i13 || i12 < i14) ? (i13 < i12 || i13 < i14) ? -1 : -2 : -3;
            int[] iArr4 = (int[]) c18464e.f36191e;
            int[] iArr5 = (int[]) c18464e.f36190e;
            m4481e(i15, i11, i10, iArr4);
            Arrays.sort(iArr4, i11, c12086e.vip + 1);
            m4481e(i15, i11, c12086e.vip, iArr4);
            int i16 = c12086e.metrica / 2;
            int i17 = 0;
            int i18 = i11;
            while (true) {
                int i19 = c12086e.vip;
                if (i18 > i19) {
                    break;
                }
                i17 += iArr5[iArr4[i18]];
                if (i17 >= i16) {
                    i11 = Math.min(i19 - 1, i18);
                    break;
                }
                i18++;
            }
            C12086e c12086e2 = new C12086e(c18464e, i11 + 1, c12086e.vip);
            c12086e.vip = i11;
            c12086e.ad();
            priorityQueue.offer(c12086e2);
            priorityQueue.offer(c12086e);
        }
        ArrayList arrayList = new ArrayList(priorityQueue.size());
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            C12086e c12086e3 = (C12086e) it.next();
            C18464e c18464e2 = c12086e3.adcel;
            int[] iArr6 = (int[]) c18464e2.f36191e;
            int[] iArr7 = (int[]) c18464e2.f36190e;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            for (int i24 = c12086e3.ad; i24 <= c12086e3.vip; i24++) {
                int i25 = iArr6[i24];
                int i26 = iArr7[i25];
                i21 += i26;
                i20 = (((i25 >> 10) & 31) * i26) + i20;
                i22 = (((i25 >> 5) & 31) * i26) + i22;
                i23 += i26 * (i25 & 31);
            }
            float f = i21;
            C18075e c18075e = new C18075e(Color.rgb(m4480e(Math.round(i20 / f), 5, 8), m4480e(Math.round(i22 / f), 5, 8), m4480e(Math.round(i23 / f), 5, 8)), i21);
            if (!m4493e(c18075e.vip())) {
                arrayList.add(c18075e);
            }
        }
        this.f36192e = arrayList;
    }

    /* renamed from: eؒٞ٘, reason: contains not printable characters */
    public static int m4480e(int i, int i2, int i3) {
        return (i3 > i2 ? i << (i3 - i2) : i >> (i2 - i3)) & ((1 << i3) - 1);
    }

    /* renamed from: eؚٕؗ, reason: contains not printable characters */
    public static void m4481e(int i, int i2, int i3, int[] iArr) {
        if (i == -2) {
            while (i2 <= i3) {
                int i4 = iArr[i2];
                iArr[i2] = (i4 & 31) | (((i4 >> 5) & 31) << 10) | (((i4 >> 10) & 31) << 5);
                i2++;
            }
            return;
        }
        if (i != -1) {
            return;
        }
        while (i2 <= i3) {
            int i5 = iArr[i2];
            iArr[i2] = ((i5 >> 10) & 31) | ((i5 & 31) << 10) | (((i5 >> 5) & 31) << 5);
            i2++;
        }
    }

    /* renamed from: eّ۟ٝ, reason: contains not printable characters */
    public static C18464e m4482e(SharedPreferences sharedPreferences, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        C18464e c18464e = new C18464e(sharedPreferences, scheduledThreadPoolExecutor);
        synchronized (((ArrayDeque) c18464e.f36189e)) {
            try {
                ((ArrayDeque) c18464e.f36189e).clear();
                String string = ((SharedPreferences) c18464e.f36191e).getString((String) c18464e.f36190e, BuildConfig.FLAVOR);
                if (!TextUtils.isEmpty(string) && string.contains((String) c18464e.f36192e)) {
                    String[] split = string.split((String) c18464e.f36192e, -1);
                    if (split.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : split) {
                        if (!TextUtils.isEmpty(str)) {
                            ((ArrayDeque) c18464e.f36189e).add(str);
                        }
                    }
                    return c18464e;
                }
                return c18464e;
            } finally {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        if (r3 != r1.f25459e) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x0030, B:13:0x007b, B:15:0x0051, B:17:0x0057, B:18:0x005b, B:20:0x005f, B:22:0x006a, B:26:0x0045, B:30:0x004e, B:34:0x003e), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x0030, B:13:0x007b, B:15:0x0051, B:17:0x0057, B:18:0x005b, B:20:0x005f, B:22:0x006a, B:26:0x0045, B:30:0x004e, B:34:0x003e), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0078 -> B:13:0x007b). Please report as a decompilation issue!!! */
    /* renamed from: private, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m4483private(defpackage.C18464e r7, defpackage.AbstractC10731e r8) {
        /*
            java.lang.Object r0 = r7.f36189e
            eٖٓٞ r0 = (defpackage.C14137e) r0
            java.lang.Object r1 = r7.f36194e
            eّۙٗ r1 = (defpackage.C12718e) r1
            boolean r2 = r8 instanceof defpackage.C17122e
            if (r2 == 0) goto L1b
            r2 = r8
            eٗٛٝ r2 = (defpackage.C17122e) r2
            int r3 = r2.f33513e
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1b
            int r3 = r3 - r4
            r2.f33513e = r3
            goto L20
        L1b:
            eٗٛٝ r2 = new eٗٛٝ
            r2.<init>(r7, r8)
        L20:
            java.lang.Object r8 = r2.f33511e
            int r3 = r2.f33513e
            eٟؔۙ r4 = defpackage.EnumC2821e.f6782e
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L42
            if (r3 == r6) goto L3e
            if (r3 != r5) goto L36
            int r3 = r2.f33512e
            defpackage.AbstractC2003e.purchase(r8)     // Catch: java.lang.Throwable -> L34
            goto L7b
        L34:
            r8 = move-exception
            goto L80
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            defpackage.AbstractC2003e.purchase(r8)     // Catch: java.lang.Throwable -> L34
            goto L4e
        L42:
            defpackage.AbstractC2003e.purchase(r8)
        L45:
            r2.f33513e = r6     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r0.mopub(r2)     // Catch: java.lang.Throwable -> L34
            if (r8 != r4) goto L4e
            goto L7a
        L4e:
            r1.addLast(r8)     // Catch: java.lang.Throwable -> L34
        L51:
            boolean r8 = r1.isEmpty()     // Catch: java.lang.Throwable -> L34
            if (r8 != 0) goto L45
            java.lang.Object r8 = r0.yandex()     // Catch: java.lang.Throwable -> L34
        L5b:
            boolean r3 = r8 instanceof defpackage.C8870e     // Catch: java.lang.Throwable -> L34
            if (r3 != 0) goto L6a
            defpackage.C0183e.vip(r8)     // Catch: java.lang.Throwable -> L34
            r1.addLast(r8)     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r0.yandex()     // Catch: java.lang.Throwable -> L34
            goto L5b
        L6a:
            int r3 = r1.f25459e     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r7.f36190e     // Catch: java.lang.Throwable -> L34
            eٍٟٔ r8 = (defpackage.C14874e) r8     // Catch: java.lang.Throwable -> L34
            r2.f33512e = r3     // Catch: java.lang.Throwable -> L34
            r2.f33513e = r5     // Catch: java.lang.Throwable -> L34
            java.lang.Object r8 = r8.invoke(r1, r2)     // Catch: java.lang.Throwable -> L34
            if (r8 != r4) goto L7b
        L7a:
            return
        L7b:
            int r8 = r1.f25459e     // Catch: java.lang.Throwable -> L34
            if (r3 != r8) goto L51
            goto L45
        L80:
            r7.m4511e(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18464e.m4483private(eۣۡ, eُؑ۠):void");
    }

    /* renamed from: throw, reason: not valid java name */
    public static final void m4484throw(C18464e c18464e, Throwable th) {
        C12718e c12718e = (C12718e) c18464e.f36194e;
        C14137e c14137e = (C14137e) c18464e.f36189e;
        if (c14137e.smaato(th, false)) {
            for (Object yandex = c14137e.yandex(); !(yandex instanceof C8870e); yandex = c14137e.yandex()) {
                C0183e.vip(yandex);
                c12718e.addLast(yandex);
            }
            if (c12718e.isEmpty()) {
                return;
            }
            new ArrayList(c12718e);
            Unit unit = Unit.INSTANCE;
            c12718e.clear();
        }
    }

    @Override // defpackage.InterfaceC16843e
    public void Signature(C4194e c4194e) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).Signature(c4194e);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: abstract */
    public long mo2061abstract() {
        return ((AbstractC11130e) this.f36191e).mo2061abstract();
    }

    @Override // defpackage.InterfaceC2560e
    public Object ad(Class cls) {
        if (!((Set) this.f36191e).contains(C16786e.ad(cls))) {
            throw new C14803e(AbstractC17861e.loadAd(cls, "Attempting to request an undeclared dependency ", "."), 2, (byte) 0);
        }
        Object ad = ((InterfaceC2560e) this.f36194e).ad(cls);
        if (!cls.equals(InterfaceC7138e.class)) {
            return ad;
        }
        return new Object();
    }

    @Override // defpackage.InterfaceC2560e
    public C10377e adcel(C16786e c16786e) {
        if (((Set) this.f36192e).contains(c16786e)) {
            return ((InterfaceC2560e) this.f36194e).adcel(c16786e);
        }
        throw new C14803e("Attempting to request an undeclared dependency Deferred<" + c16786e + ">.", 2, (byte) 0);
    }

    @Override // defpackage.InterfaceC16843e
    public void admob(long j) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).admob(j);
    }

    @Override // defpackage.InterfaceC16843e
    public long ads() {
        return ((AbstractC11130e) this.f36191e).ads();
    }

    @Override // defpackage.InterfaceC2560e
    public InterfaceC7970e advert(C16786e c16786e) {
        if (((Set) this.f36190e).contains(c16786e)) {
            return ((InterfaceC2560e) this.f36194e).advert(c16786e);
        }
        throw new C14803e("Attempting to request an undeclared dependency Provider<" + c16786e + ">.", 2, (byte) 0);
    }

    @Override // defpackage.InterfaceC15813e
    public void amazon(C0520e c0520e, Object obj) {
        ((C14461e) this.f36191e).amazon(c0520e, obj);
    }

    @Override // defpackage.InterfaceC16843e
    public boolean applovin() {
        return ((AbstractC11130e) this.f36191e).applovin();
    }

    @Override // defpackage.InterfaceC2560e
    public InterfaceC7970e appmetrica(Class cls) {
        return advert(C16786e.ad(cls));
    }

    @Override // defpackage.InterfaceC16843e
    public int billing() {
        return ((AbstractC11130e) this.f36191e).billing();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: break */
    public int mo2062break() {
        return ((AbstractC11130e) this.f36191e).mo2062break();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: case */
    public void mo2063case() {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2063case();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: catch */
    public float mo2064catch() {
        return ((AbstractC11130e) this.f36191e).mo2064catch();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: class */
    public void mo2065class(C1962e c1962e, long j) {
        ArrayList arrayList = (ArrayList) this.f36194e;
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2065class(c1962e, j);
        arrayList.clear();
        arrayList.add(c1962e);
    }

    /* renamed from: const, reason: not valid java name */
    public void m4485const(Class cls, String str, InterfaceC2499e interfaceC2499e) {
        ((HashMap) this.f36192e).put(cls, interfaceC2499e);
        if (str != null) {
            ((HashMap) this.f36189e).put(str, cls);
            ((HashMap) this.f36194e).put(cls, str);
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: continue */
    public void mo2066continue() {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2066continue();
    }

    @Override // defpackage.InterfaceC15813e
    public void crashlytics(C0520e c0520e, C11709e c11709e, C0520e c0520e2) {
        ((C14461e) this.f36191e).crashlytics(c0520e, c11709e, c0520e2);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: default */
    public int mo2067default() {
        return ((AbstractC11130e) this.f36191e).mo2067default();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: else */
    public void mo2068else(int i) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2068else(i);
        ((ArrayList) this.f36194e).remove(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC15374e
    /* renamed from: extends */
    public float mo2750extends() {
        return ((Number) this.f36194e.getValue()).floatValue();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eَؑۨ */
    public void mo2069e(int i, int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.f36194e;
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i4 = i2 - i;
        while (true) {
            i4--;
            if (-1 >= i4) {
                arrayList.addAll(Math.min(i3, arrayList.size()), arrayDeque);
                return;
            }
            arrayDeque.addFirst(arrayList.remove(i + i4));
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؚؑ۟ */
    public Looper mo3030e() {
        return ((InterfaceC16843e) ((AbstractC11130e) this.f36191e).f22047e).mo3030e();
    }

    /* renamed from: eؑ۠ۖ, reason: contains not printable characters */
    public void m4486e(String str) {
        if (AbstractC6507e.pro(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (AbstractC6507e.pro(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        C14052e c14052e = new C14052e();
        c14052e.adcel(null, str);
        this.f36191e = c14052e.metrica();
    }

    /* renamed from: eۣؑۡ, reason: contains not printable characters */
    public C3895e m4487e(InterfaceC6545e interfaceC6545e, Map map, Map map2) {
        C17280e c17280e = (C17280e) this.f36191e;
        C9485e c9485e = (C9485e) this.f36190e;
        int i = c9485e.startapp;
        C2107e c2107e = (C2107e) this.f36192e;
        C12204e c12204e = (C12204e) this.f36194e;
        C5122e c5122e = (C5122e) this.f36189e;
        c5122e.vip.getClass();
        c9485e.loadAd.getClass();
        C6434e c6434e = InterfaceC2531e.yandex;
        InterfaceC2531e appmetrica = ((C7520e) c5122e.ad).appmetrica(c9485e.ad);
        c6434e.getClass();
        return new C3895e(interfaceC6545e, c17280e, i, map, map2, c2107e, c12204e, C6434e.vip(appmetrica));
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؑۥؘ */
    public void mo2070e(int i, List list) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2070e(i, list);
        ((ArrayList) this.f36194e).addAll(i, list);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؒ٘ؗ */
    public long mo2071e() {
        return ((AbstractC11130e) this.f36191e).mo2071e();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؒٚۨ */
    public void mo2072e() {
        ((AbstractC11130e) this.f36191e).mo2072e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r6.getRunCount() == 1) goto L25;
     */
    /* renamed from: eٟؒؗ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.text.Bidi m4488e(int r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f36191e
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.f36192e
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.f36190e
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.f36189e
            boolean[] r3 = (boolean[]) r3
            boolean r4 = r3[r15]
            if (r4 == 0) goto L1b
            java.lang.Object r15 = r2.get(r15)
            java.text.Bidi r15 = (java.text.Bidi) r15
            return r15
        L1b:
            r4 = 0
            if (r15 != 0) goto L20
            r5 = r4
            goto L2c
        L20:
            int r5 = r15 + (-1)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L2c:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r11 = r1 - r5
            java.lang.Object r6 = r14.f36194e
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L44
            int r7 = r6.length
            if (r7 >= r11) goto L42
            goto L44
        L42:
            r7 = r6
            goto L47
        L44:
            char[] r6 = new char[r11]
            goto L42
        L47:
            java.lang.CharSequence r6 = r0.getText()
            android.text.TextUtils.getChars(r6, r5, r1, r7, r4)
            boolean r1 = java.text.Bidi.requiresBidi(r7, r4, r11)
            r5 = 0
            r13 = 1
            if (r1 == 0) goto L76
            int r1 = r14.m4504e(r15)
            int r1 = r0.getLineForOffset(r1)
            int r0 = r0.getParagraphDirection(r1)
            r1 = -1
            if (r0 != r1) goto L67
            r12 = r13
            goto L68
        L67:
            r12 = r4
        L68:
            java.text.Bidi r6 = new java.text.Bidi
            r9 = 0
            r10 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r13) goto L77
        L76:
            r6 = r5
        L77:
            r2.set(r15, r6)
            r3[r15] = r13
            if (r6 == 0) goto L87
            java.lang.Object r15 = r14.f36194e
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.f36194e = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C18464e.m4488e(int):java.text.Bidi");
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؒۖۗ */
    public C9039e mo2074e() {
        return ((AbstractC11130e) this.f36191e).mo2074e();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؒۤۨ */
    public long mo2075e() {
        return ((AbstractC11130e) this.f36191e).mo2075e();
    }

    /* renamed from: eؓٞؖ, reason: contains not printable characters */
    public boolean m4489e(Object obj) {
        boolean remove;
        synchronized (((ArrayDeque) this.f36189e)) {
            remove = ((ArrayDeque) this.f36189e).remove(obj);
            if (remove) {
                ((ScheduledThreadPoolExecutor) this.f36194e).execute(new RunnableC1352e(1, this));
            }
        }
        return remove;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eّؔٞ */
    public void mo2076e(List list) {
        ArrayList arrayList = (ArrayList) this.f36194e;
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2076e(list);
        arrayList.clear();
        arrayList.addAll(list);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eِؕٛ */
    public void mo2077e() {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2077e();
    }

    /* renamed from: eِؖؕ, reason: contains not printable characters */
    public void m4490e(Object obj, String str) {
        ((LinkedHashMap) this.f36191e).put(str, obj);
        InterfaceC8384e interfaceC8384e = (InterfaceC8384e) ((LinkedHashMap) this.f36192e).get(str);
        if (interfaceC8384e != null) {
            ((C1615e) interfaceC8384e).advert(obj);
        }
        InterfaceC8384e interfaceC8384e2 = (InterfaceC8384e) ((LinkedHashMap) this.f36189e).get(str);
        if (interfaceC8384e2 != null) {
            ((C1615e) interfaceC8384e2).advert(obj);
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؘْؖ */
    public void mo2078e() {
        ((AbstractC11130e) this.f36191e).mo2078e();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٍؖۙ */
    public boolean mo2079e() {
        return ((AbstractC11130e) this.f36191e).mo2079e();
    }

    /* renamed from: eًؖٝ, reason: contains not printable characters */
    public int m4491e(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.f36192e;
        int vip = AbstractC6874e.vip(arrayList, Integer.valueOf(i));
        int i2 = vip < 0 ? -(vip + 1) : vip + 1;
        if (z && i2 > 0) {
            int i3 = i2 - 1;
            if (i == ((Number) arrayList.get(i3)).intValue()) {
                return i3;
            }
        }
        return i2;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٌؖۡ */
    public void mo2080e() {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2080e();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؖۡٝ */
    public boolean mo2081e() {
        return ((AbstractC11130e) this.f36191e).mo2081e();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؗۦۣ */
    public boolean mo3031e() {
        return ((InterfaceC16843e) ((AbstractC11130e) this.f36191e).f22047e).mo3031e();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؘؕۥ */
    public boolean mo2083e() {
        return ((AbstractC11130e) this.f36191e).mo2083e();
    }

    /* renamed from: eؘؗؕ, reason: contains not printable characters */
    public String m4492e() {
        String str;
        synchronized (((ArrayDeque) this.f36189e)) {
            str = (String) ((ArrayDeque) this.f36189e).peek();
        }
        return str;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؘُٔ */
    public C12053e mo2085e() {
        return ((AbstractC11130e) this.f36191e).mo2085e();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؘٕۚ */
    public void mo2086e(boolean z) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2086e(z);
    }

    /* renamed from: eؘۗٚ, reason: contains not printable characters */
    public boolean m4493e(float[] fArr) {
        C18256e[] c18256eArr = (C18256e[]) this.f36189e;
        if (c18256eArr != null && c18256eArr.length > 0) {
            for (C18256e c18256e : c18256eArr) {
                c18256e.getClass();
                float f = fArr[2];
                if (f < 0.95f && f > 0.05f) {
                    float f2 = fArr[0];
                    if (f2 < 10.0f || f2 > 37.0f || fArr[1] > 0.82f) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: eؘِۢ, reason: contains not printable characters */
    public void m4494e(String str, AbstractC1101e abstractC1101e) {
        if (str.length() <= 0) {
            throw new IllegalArgumentException("method.isEmpty() == true");
        }
        if (abstractC1101e == null) {
            if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                throw new IllegalArgumentException(AbstractC5087e.m1746extends("method ", str, " must have a request body.").toString());
            }
        } else if (!AbstractC13083e.license(str)) {
            throw new IllegalArgumentException(AbstractC5087e.m1746extends("method ", str, " must not have a request body.").toString());
        }
        this.f36190e = str;
        this.f36189e = abstractC1101e;
    }

    /* renamed from: eؙؐ٘, reason: contains not printable characters */
    public boolean m4495e(InterfaceC1921e interfaceC1921e) {
        return !(((C14137e) this.f36189e).amazon(interfaceC1921e) instanceof C8870e);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؙؖؗ */
    public int mo2088e() {
        return ((AbstractC11130e) this.f36191e).mo2088e();
    }

    /* renamed from: eؙؙٝ, reason: contains not printable characters */
    public C0624e m4496e() {
        C17306e c17306e;
        Context context = (Context) this.f36191e;
        C13661e c13661e = (C13661e) this.f36190e;
        C9061e c9061e = (C9061e) this.f36194e;
        c9061e.getClass();
        C13661e c13661e2 = new C13661e(c13661e.ad, c13661e.vip, c13661e.metrica, c13661e.license, c13661e.appmetrica, c13661e.purchase, c13661e.billing, c13661e.yandex, c13661e.startapp, c13661e.adcel, c13661e.mopub, c13661e.advert, c13661e.smaato, new C14193e(AbstractC18467e.license(c9061e.ad)));
        C5363e c5363e = new C5363e(new C13564e(14));
        C5363e c5363e2 = new C5363e(new C12851e(4, this));
        C5363e c5363e3 = (C5363e) this.f36192e;
        C5363e c5363e4 = c5363e3 == null ? new C5363e(new C13564e(15)) : c5363e3;
        C17306e c17306e2 = (C17306e) this.f36189e;
        if (c17306e2 == null) {
            C13664e c13664e = C13664e.f27089e;
            c17306e = new C17306e(c13664e, c13664e, c13664e, c13664e, c13664e);
        } else {
            c17306e = c17306e2;
        }
        return new C0624e(new C11307e(context, c13661e2, c5363e, c5363e2, c5363e4, c17306e));
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٍؙّ */
    public C12053e mo2089e() {
        return ((AbstractC11130e) this.f36191e).mo2089e();
    }

    /* renamed from: eؙۛ۠, reason: contains not printable characters */
    public void m4497e(Function1 function1) {
        int i;
        synchronized (this.f36191e) {
            try {
                C12328e c12328e = (C12328e) this.f36189e;
                this.f36189e = (C12328e) this.f36194e;
                this.f36194e = c12328e;
                C11936e c11936e = (C11936e) this.f36192e;
                do {
                    i = c11936e.get();
                } while (!c11936e.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                int i2 = c12328e.vip;
                for (int i3 = 0; i3 < i2; i3++) {
                    function1.invoke(c12328e.yandex(i3));
                }
                c12328e.purchase();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؚؚؓ */
    public int mo2090e() {
        return ((AbstractC11130e) this.f36191e).mo2090e();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؚٜ۠ */
    public boolean mo2091e() {
        return ((AbstractC11130e) this.f36191e).mo2091e();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؚۜؑ */
    public void mo3032e(C3335e c3335e, boolean z) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo3032e(c3335e, z);
    }

    /* renamed from: eًًؓ, reason: contains not printable characters */
    public boolean m4498e(byte[] bArr, C10312e[] c10312eArr, byte[] bArr2, long j, int i, byte[] bArr3) {
        C13935e c13935e = new C13935e(1);
        C10312e c10312e = c10312eArr[0];
        c13935e.m3739new(0);
        c13935e.m3741private(j);
        C18464e c18464e = this;
        byte[] m4514e = c18464e.m4514e(i, c10312e, bArr, bArr2, c13935e);
        int i2 = 1;
        while (true) {
            AbstractC7629e abstractC7629e = (AbstractC7629e) c18464e.f36192e;
            if (i2 >= abstractC7629e.purchase) {
                return Arrays.equals(bArr3, m4514e);
            }
            int i3 = (int) (((1 << r12) - 1) & j);
            j >>>= abstractC7629e.adcel;
            C10312e c10312e2 = c10312eArr[i2];
            c13935e.m3739new(i2);
            c13935e.m3741private(j);
            m4514e = c18464e.m4514e(i3, c10312e2, m4514e, bArr2, c13935e);
            i2++;
            c18464e = this;
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eًًؓ */
    public void mo2092e(int i) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2092e(i);
    }

    /* renamed from: eًٓؓ, reason: contains not printable characters */
    public float m4499e(int i, boolean z) {
        Layout layout = (Layout) this.f36191e;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i));
        if (i > lineEnd) {
            i = lineEnd;
        }
        return z ? layout.getPrimaryHorizontal(i) : layout.getSecondaryHorizontal(i);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٌؙٞ */
    public void mo2093e() {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2093e();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٌۘۤ */
    public void mo2094e(int i, long j, List list) {
        ArrayList arrayList = (ArrayList) this.f36194e;
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2094e(i, j, list);
        arrayList.clear();
        arrayList.addAll(list);
    }

    /* renamed from: eٌۡٔ, reason: contains not printable characters */
    public void m4500e(InterfaceC2881e interfaceC2881e, InterfaceC2881e interfaceC2881e2, C4753e c4753e, C4753e c4753e2, Map.Entry entry) {
        C4753e c4753e3 = (C4753e) entry.getValue();
        AbstractC9464e.yandex("DualSurfaceProcessorNode", "     -> outputEdge = " + c4753e3);
        C5453e c5453e = new C5453e(c4753e.billing.ad, ((C5013e) entry.getKey()).ad.license, c4753e.metrica ? interfaceC2881e : null, ((C5013e) entry.getKey()).ad.purchase, ((C5013e) entry.getKey()).ad.billing);
        C5453e c5453e2 = new C5453e(c4753e2.billing.ad, ((C5013e) entry.getKey()).vip.license, c4753e2.metrica ? interfaceC2881e2 : null, ((C5013e) entry.getKey()).vip.purchase, ((C5013e) entry.getKey()).vip.billing);
        int i = ((C5013e) entry.getKey()).ad.metrica;
        c4753e3.getClass();
        AbstractC13062e.metrica();
        c4753e3.vip();
        AbstractC4265e.yandex("Consumer can only be linked once.", !c4753e3.adcel);
        c4753e3.adcel = true;
        C16887e c16887e = c4753e3.advert;
        RunnableC3397e remoteconfig = AbstractC15792e.remoteconfig(c16887e.metrica(), new C12886e(c4753e3, c16887e, i, c5453e, c5453e2), AbstractC3062e.amazon());
        remoteconfig.ad(new RunnableC17144e(remoteconfig, new C18540e(this, c4753e3, false, 16), 0), AbstractC3062e.amazon());
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٍؓۙ */
    public void mo2095e(int i) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2095e(i);
    }

    /* renamed from: eٍۢؒ, reason: contains not printable characters */
    public Object m4501e(AbstractC10731e abstractC10731e) {
        return AbstractC7535e.startapp(new C7371e((C1615e) this.f36194e, 15), abstractC10731e);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eَٖٓ */
    public void mo2096e(C12053e c12053e) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2096e(c12053e);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eُٓؓ */
    public long mo2097e() {
        return ((AbstractC11130e) this.f36191e).mo2097e();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eُؚٕ */
    public long mo2098e() {
        return ((AbstractC11130e) this.f36191e).mo2098e();
    }

    /* renamed from: eؘُٗ, reason: contains not printable characters */
    public C4199e m4502e() {
        return (C4199e) ((C1615e) this.f36194e).getValue();
    }

    /* renamed from: eُۘٙ, reason: contains not printable characters */
    public void m4503e(InterfaceC18435e interfaceC18435e, C14918e c14918e, C0063e c0063e, C0063e c0063e2, boolean z) {
        AbstractC5336e.purchase(interfaceC18435e, ExecutorC3603e.f8134e, 0, new C9275e(z, this, c14918e, c0063e2, AbstractC5336e.purchase(interfaceC18435e, AbstractC6731e.ad, 0, new C15238e(c0063e, null, 5), 2), null), 2);
    }

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public int m4504e(int i) {
        if (i == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.f36192e).get(i - 1)).intValue();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eِؗؓ */
    public int mo2100e() {
        return ((AbstractC11130e) this.f36191e).mo2100e();
    }

    /* renamed from: eُِؕ, reason: contains not printable characters */
    public void m4505e() {
        this.f36189e = null;
        ((Function0) this.f36190e).invoke();
    }

    /* renamed from: eِْ۠, reason: contains not printable characters */
    public byte[] m4506e(byte[] bArr, int i, int i2, byte[] bArr2, C13935e c13935e) {
        int i3 = i;
        if (((i3 >>> i2) << i2) != i3) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        C13935e c13935e2 = new C13935e(c13935e);
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = 1;
            if (i5 >= (1 << i2)) {
                return ((C17078e) linkedList.get(i4)).ad;
            }
            c13935e2.m3736import(i4);
            int i7 = i3 + i5;
            c13935e2.m3745super(i7);
            C2691e c2691e = (C2691e) this.f36189e;
            C13935e c13935e3 = new C13935e(c13935e2);
            AbstractC7629e abstractC7629e = (AbstractC7629e) c2691e.f6570e;
            int i8 = abstractC7629e.metrica;
            byte[][] bArr3 = new byte[i8];
            int i9 = i4;
            while (i9 < i8) {
                C13935e c13935e4 = new C13935e(c13935e2);
                byte[] bArr4 = (byte[]) c13935e4.f27641e;
                c13935e4.m3736import(5);
                c13935e4.m3745super(c13935e2.subs());
                AbstractC3628e.billing(i9, 24, bArr4);
                AbstractC3628e.billing(0, 28, bArr4);
                int i10 = i8;
                byte[][] bArr5 = bArr3;
                byte[] license = abstractC7629e.license(c13935e4, bArr2, bArr);
                c13935e4.m3736import(0);
                c13935e4.m3745super(c13935e2.subs());
                AbstractC3628e.billing(i9, 24, bArr4);
                AbstractC3628e.billing(0, 28, bArr4);
                int i11 = i9;
                bArr5[i11] = c2691e.firebase(license, 0, 15, bArr2, c13935e4);
                i9 = i11 + 1;
                bArr3 = bArr5;
                i8 = i10;
                i6 = 1;
            }
            int i12 = i6;
            c13935e3.m3736import(i12);
            c13935e3.m3745super(c13935e2.subs());
            byte[] purchase = abstractC7629e.purchase(c13935e3, bArr2, AbstractC12442e.smaato(bArr3));
            c13935e2.m3736import(2);
            c13935e2.m3740package(i12);
            c13935e2.m3749transient(i7);
            int i13 = i12;
            while (!linkedList.isEmpty() && ((C17078e) linkedList.get(0)).vip == i13) {
                i7 = (i7 - i12) / 2;
                c13935e2.m3749transient(i7);
                purchase = ((AbstractC7629e) this.f36192e).vip(c13935e2, bArr2, ((C17078e) linkedList.remove(0)).ad, purchase);
                i13++;
                c13935e2.m3740package(i13);
            }
            linkedList.add(0, new C17078e(i13, purchase));
            i5++;
            i3 = i;
            i4 = 0;
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؙِۡ */
    public void mo2101e(List list) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2101e(list);
        ((ArrayList) this.f36194e).addAll(list);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eّّۚ */
    public void mo2102e(C1962e c1962e) {
        ArrayList arrayList = (ArrayList) this.f36194e;
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2102e(c1962e);
        arrayList.clear();
        arrayList.add(c1962e);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eّْٝ */
    public void mo2103e(C1962e c1962e) {
        ArrayList arrayList = (ArrayList) this.f36194e;
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2103e(c1962e);
        arrayList.clear();
        arrayList.add(c1962e);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eًْٕ */
    public C4491e mo2104e() {
        return ((AbstractC11130e) this.f36191e).mo2104e();
    }

    /* renamed from: eْٗۚ, reason: contains not printable characters */
    public void m4507e(Throwable th) {
        int i;
        synchronized (this.f36191e) {
            try {
                if (((Throwable) this.f36190e) != null) {
                    return;
                }
                this.f36190e = th;
                C12328e c12328e = (C12328e) this.f36189e;
                Object[] objArr = c12328e.ad;
                int i2 = c12328e.vip;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((AbstractC1237e) objArr[i3]).vip(th);
                }
                ((C12328e) this.f36189e).purchase();
                C11936e c11936e = (C11936e) this.f36192e;
                do {
                    i = c11936e.get();
                } while (!c11936e.compareAndSet(i, ((((i >>> 27) & 15) + 1) & 15) << 27));
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eْۢؕ */
    public AbstractC6690e mo2105e() {
        return ((AbstractC11130e) this.f36191e).mo2105e();
    }

    /* renamed from: eْۥؑ, reason: contains not printable characters */
    public C10377e m4508e(Class cls) {
        return adcel(C16786e.ad(cls));
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٍٓۢ */
    public int mo2106e() {
        return ((AbstractC11130e) this.f36191e).mo2106e();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eِٓۦ */
    public boolean mo2107e(int i) {
        return ((AbstractC11130e) this.f36191e).mo2107e(i);
    }

    /* renamed from: eٓٔؔ, reason: contains not printable characters */
    public float m4509e(int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int i4 = i;
        Layout layout = (Layout) this.f36191e;
        if (!z2) {
            return m4499e(i, z);
        }
        int license = AbstractC14161e.license(layout, i4, z2);
        int lineStart = layout.getLineStart(license);
        int lineEnd = layout.getLineEnd(license);
        if (i4 != lineStart && i4 != lineEnd) {
            return m4499e(i, z);
        }
        if (i4 == 0 || i4 == layout.getText().length()) {
            return m4499e(i, z);
        }
        int m4491e = m4491e(i4, z2);
        boolean z3 = layout.getParagraphDirection(layout.getLineForOffset(m4504e(m4491e))) == -1;
        int m4517e = m4517e(lineEnd, lineStart);
        int m4504e = m4504e(m4491e);
        int i5 = lineStart - m4504e;
        int i6 = m4517e - m4504e;
        Bidi m4488e = m4488e(m4491e);
        Bidi createLineBidi = m4488e != null ? m4488e.createLineBidi(i5, i6) : null;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z || z3 == isRtlCharAt) {
                z3 = !z3;
            }
            return i4 == lineStart ? z3 : !z3 ? layout.getLineLeft(license) : layout.getLineRight(license);
        }
        int runCount = createLineBidi.getRunCount();
        C2429e[] c2429eArr = new C2429e[runCount];
        for (int i7 = 0; i7 < runCount; i7++) {
            c2429eArr[i7] = new C2429e(createLineBidi.getRunStart(i7) + lineStart, createLineBidi.getRunLimit(i7) + lineStart, createLineBidi.getRunLevel(i7) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i8 = 0; i8 < runCount2; i8++) {
            bArr[i8] = (byte) createLineBidi.getRunLevel(i8);
        }
        Bidi.reorderVisually(bArr, 0, c2429eArr, 0, runCount);
        if (i4 == lineStart) {
            int i9 = 0;
            while (true) {
                if (i9 >= runCount) {
                    i3 = -1;
                    break;
                }
                if (c2429eArr[i9].ad == i4) {
                    i3 = i9;
                    break;
                }
                i9++;
            }
            boolean z4 = (z || z3 == c2429eArr[i3].metrica) ? !z3 : z3;
            return (i3 == 0 && z4) ? layout.getLineLeft(license) : (i3 != runCount - 1 || z4) ? z4 ? layout.getPrimaryHorizontal(c2429eArr[i3 - 1].ad) : layout.getPrimaryHorizontal(c2429eArr[i3 + 1].ad) : layout.getLineRight(license);
        }
        if (i4 > m4517e) {
            i4 = m4517e(i4, lineStart);
        }
        int i10 = 0;
        while (true) {
            if (i10 >= runCount) {
                i2 = -1;
                break;
            }
            if (c2429eArr[i10].vip == i4) {
                i2 = i10;
                break;
            }
            i10++;
        }
        boolean z5 = (z || z3 == c2429eArr[i2].metrica) ? z3 : !z3;
        return (i2 == 0 && z5) ? layout.getLineLeft(license) : (i2 != runCount - 1 || z5) ? z5 ? layout.getPrimaryHorizontal(c2429eArr[i2 - 1].vip) : layout.getPrimaryHorizontal(c2429eArr[i2 + 1].vip) : layout.getLineRight(license);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٓٛۢ */
    public boolean mo2108e() {
        return ((AbstractC11130e) this.f36191e).mo2108e();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٔؖۘ */
    public void mo2109e() {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2109e();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٌٔٗ */
    public void mo2110e(int i, C1962e c1962e) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2110e(i, c1962e);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eّٔؖ */
    public void mo2111e(int i) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2111e(i);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eّٔؗ */
    public long mo2112e() {
        return ((AbstractC11130e) this.f36191e).mo2112e();
    }

    /* renamed from: eٔٞۢ, reason: contains not printable characters */
    public Set m4510e(Class cls) {
        return metrica(C16786e.ad(cls));
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٍٟٔ */
    public C1962e mo2113e() {
        return ((AbstractC11130e) this.f36191e).mo2113e();
    }

    /* renamed from: eٔۥۥ, reason: contains not printable characters */
    public void m4511e(Throwable th) {
        C12718e c12718e = (C12718e) this.f36194e;
        C14137e c14137e = (C14137e) this.f36189e;
        if (c14137e.smaato(th, false)) {
            for (Object yandex = c14137e.yandex(); !(yandex instanceof C8870e); yandex = c14137e.yandex()) {
                C0183e.vip(yandex);
                c12718e.addLast(yandex);
            }
            if (c12718e.isEmpty()) {
                return;
            }
            ((C2098e) this.f36191e).invoke(new ArrayList(c12718e));
            c12718e.clear();
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٕؓٝ */
    public int mo2115e() {
        return ((AbstractC11130e) this.f36191e).mo2115e();
    }

    /* renamed from: eٍٕ, reason: contains not printable characters */
    public void m4512e(String str) {
        ((C15783e) this.f36192e).startapp(str);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٕٙؗ */
    public long mo2116e() {
        return ((AbstractC11130e) this.f36191e).mo2116e();
    }

    /* renamed from: eؘٖؕ, reason: contains not printable characters */
    public byte[] m4513e(int i, long j, byte[] bArr) {
        C13935e c13935e = new C13935e(1);
        c13935e.m3739new(0);
        c13935e.m3741private(j);
        C18464e c18464e = this;
        C10312e m4516e = c18464e.m4516e(bArr, (byte[]) this.f36191e, i, (byte[]) this.f36190e, c13935e);
        AbstractC7629e abstractC7629e = (AbstractC7629e) c18464e.f36192e;
        int i2 = abstractC7629e.purchase;
        C10312e[] c10312eArr = new C10312e[i2];
        c10312eArr[0] = m4516e;
        c13935e.m3739new(0);
        c13935e.m3741private(j);
        byte[] m4514e = c18464e.m4514e(i, m4516e, bArr, (byte[]) c18464e.f36190e, c13935e);
        int i3 = 1;
        while (i3 < i2) {
            int i4 = (int) (((1 << r2) - 1) & j);
            j >>>= abstractC7629e.adcel;
            c13935e.m3739new(i3);
            c13935e.m3741private(j);
            C10312e m4516e2 = c18464e.m4516e(m4514e, (byte[]) c18464e.f36191e, i4, (byte[]) c18464e.f36190e, c13935e);
            c10312eArr[i3] = m4516e2;
            if (i3 < i2 - 1) {
                m4514e = c18464e.m4514e(i4, m4516e2, m4514e, (byte[]) c18464e.f36190e, c13935e);
            }
            i3++;
            c18464e = this;
        }
        byte[][] bArr2 = new byte[i2];
        for (int i5 = 0; i5 != i2; i5++) {
            C10312e c10312e = c10312eArr[i5];
            bArr2[i5] = AbstractC12442e.adcel((byte[]) c10312e.f20361e, AbstractC12442e.smaato((byte[][]) c10312e.f20360e));
        }
        return AbstractC12442e.smaato(bArr2);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؘٖؗ */
    public void mo2117e(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f36194e;
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2117e(i, i2);
        arrayList.add(Math.min(i2, arrayList.size()), arrayList.remove(i));
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٖٔۧ */
    public void mo2118e() {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2118e();
    }

    /* renamed from: eِٗۛ, reason: contains not printable characters */
    public byte[] m4514e(int i, C10312e c10312e, byte[] bArr, byte[] bArr2, C13935e c13935e) {
        AbstractC7629e abstractC7629e = (AbstractC7629e) this.f36192e;
        C13935e c13935e2 = new C13935e(c13935e);
        byte[] bArr3 = (byte[]) c13935e2.f27641e;
        int i2 = 0;
        c13935e2.m3736import(0);
        c13935e2.m3745super(i);
        byte[] bArr4 = (byte[]) c10312e.f20361e;
        byte[][] bArr5 = (byte[][]) c10312e.f20360e;
        C2691e c2691e = (C2691e) this.f36189e;
        C13935e c13935e3 = new C13935e(c13935e2);
        AbstractC7629e abstractC7629e2 = (AbstractC7629e) c2691e.f6570e;
        int i3 = abstractC7629e2.metrica;
        int i4 = abstractC7629e2.ad;
        int[] iArr = new int[i3];
        c2691e.premium(bArr, 0, iArr, 0, abstractC7629e2.license);
        int i5 = 0;
        for (int i6 = 0; i6 < abstractC7629e2.license; i6++) {
            i5 += 15 - iArr[i6];
        }
        int i7 = abstractC7629e2.appmetrica * abstractC7629e2.vip;
        byte[] bArr6 = new byte[4];
        AbstractC3628e.billing(i5 << (8 - (i7 % 8)), 0, bArr6);
        c2691e.premium(bArr6, 4 - ((i7 + 7) / 8), iArr, abstractC7629e2.license, abstractC7629e2.appmetrica);
        AbstractC7629e abstractC7629e3 = abstractC7629e2;
        byte[] bArr7 = new byte[i4];
        byte[][] bArr8 = new byte[i3];
        int i8 = 0;
        while (i8 < i3) {
            AbstractC3628e.billing(i8, 24, bArr3);
            System.arraycopy(bArr4, i8 * i4, bArr7, 0, i4);
            int i9 = i3;
            int i10 = iArr[i8];
            C2691e c2691e2 = c2691e;
            bArr8[i8] = c2691e2.firebase(bArr7, i10, 15 - i10, bArr2, c13935e2);
            i8++;
            c13935e3 = c13935e3;
            abstractC7629e3 = abstractC7629e3;
            c2691e = c2691e2;
            i3 = i9;
            i4 = i4;
        }
        AbstractC7629e abstractC7629e4 = abstractC7629e3;
        C13935e c13935e4 = c13935e3;
        c13935e4.m3736import(1);
        c13935e4.m3745super(c13935e2.subs());
        byte[] purchase = abstractC7629e4.purchase(c13935e4, bArr2, AbstractC12442e.smaato(bArr8));
        c13935e2.m3736import(2);
        c13935e2.m3749transient(i);
        while (i2 < abstractC7629e.adcel) {
            int i11 = i2 + 1;
            c13935e2.m3740package(i11);
            if (((1 << i2) & i) == 0) {
                c13935e2.m3749transient(AbstractC3628e.metrica(28, bArr3) / 2);
                purchase = abstractC7629e.vip(c13935e2, bArr2, purchase, bArr5[i2]);
            } else {
                c13935e2.m3749transient((AbstractC3628e.metrica(28, bArr3) - 1) / 2);
                purchase = abstractC7629e.vip(c13935e2, bArr2, bArr5[i2], purchase);
            }
            i2 = i11;
        }
        return purchase;
    }

    /* renamed from: eٕٗٛ, reason: contains not printable characters */
    public C17306e m4515e() {
        return new C17306e(AbstractC18467e.metrica((ArrayList) this.f36192e), AbstractC18467e.metrica((ArrayList) this.f36191e), AbstractC18467e.metrica((ArrayList) this.f36190e), AbstractC18467e.metrica((ArrayList) this.f36189e), AbstractC18467e.metrica((ArrayList) this.f36194e));
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eٟٗۦ */
    public C18255e mo2119e() {
        return ((AbstractC11130e) this.f36191e).mo2119e();
    }

    /* renamed from: eؘٟ٘, reason: contains not printable characters */
    public C10312e m4516e(byte[] bArr, byte[] bArr2, int i, byte[] bArr3, C13935e c13935e) {
        int i2 = ((AbstractC7629e) this.f36192e).adcel;
        byte[][] bArr4 = new byte[i2];
        C13935e c13935e2 = new C13935e(c13935e);
        c13935e2.m3736import(2);
        byte[] bArr5 = (byte[]) c13935e.f27641e;
        int i3 = 0;
        c13935e2.m3739new(AbstractC3628e.metrica(0, bArr5));
        c13935e2.m3741private(AbstractC3628e.license(8, bArr5));
        for (int i4 = 0; i4 < i2; i4++) {
            bArr4[i4] = m4506e(bArr2, ((i >>> i4) ^ 1) << i4, i4, bArr3, c13935e2);
        }
        C13935e c13935e3 = new C13935e(c13935e);
        c13935e3.m3736import(0);
        c13935e3.m3745super(i);
        C2691e c2691e = (C2691e) this.f36189e;
        C13935e c13935e4 = new C13935e(c13935e3);
        byte[] bArr6 = (byte[]) c13935e4.f27641e;
        AbstractC7629e abstractC7629e = (AbstractC7629e) c2691e.f6570e;
        int i5 = abstractC7629e.metrica;
        int i6 = abstractC7629e.appmetrica;
        int[] iArr = new int[i5];
        c2691e.premium(bArr, 0, iArr, 0, abstractC7629e.license);
        int i7 = 0;
        for (int i8 = 0; i8 < abstractC7629e.license; i8++) {
            i7 += 15 - iArr[i8];
        }
        int i9 = abstractC7629e.vip;
        if (i9 % 8 != 0) {
            i7 <<= 8 - ((i6 * i9) % 8);
        }
        int i10 = ((i6 * i9) + 7) / 8;
        byte[] bArr7 = new byte[4];
        AbstractC3628e.billing(i7, 0, bArr7);
        c2691e.premium(bArr7, 4 - i10, iArr, abstractC7629e.license, abstractC7629e.appmetrica);
        byte[][] bArr8 = new byte[i5];
        int i11 = 0;
        while (i11 < i5) {
            c13935e4.m3736import(5);
            c13935e4.m3745super(c13935e3.subs());
            AbstractC3628e.billing(i11, 24, bArr6);
            AbstractC3628e.billing(i3, 28, bArr6);
            AbstractC7629e abstractC7629e2 = abstractC7629e;
            byte[] license = abstractC7629e2.license(c13935e4, bArr3, bArr2);
            c13935e4.m3736import(i3);
            c13935e4.m3745super(c13935e3.subs());
            AbstractC3628e.billing(i11, 24, bArr6);
            i3 = 0;
            AbstractC3628e.billing(0, 28, bArr6);
            C13935e c13935e5 = c13935e4;
            byte[] bArr9 = bArr6;
            C2691e c2691e2 = c2691e;
            bArr8[i11] = c2691e2.firebase(license, 0, iArr[i11], bArr3, c13935e5);
            i11++;
            i5 = i5;
            abstractC7629e = abstractC7629e2;
            c2691e = c2691e2;
            bArr6 = bArr9;
            c13935e4 = c13935e5;
        }
        return new C10312e(AbstractC12442e.smaato(bArr8), bArr4, 16);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: e٘ٓۜ */
    public boolean mo2120e() {
        return ((AbstractC11130e) this.f36191e).mo2120e();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: e٘ٔ٘ */
    public void mo2121e(InterfaceC8524e interfaceC8524e) {
        ((AbstractC11130e) this.f36191e).mo2121e(interfaceC8524e);
        ((ArrayList) this.f36192e).remove(interfaceC8524e);
    }

    /* renamed from: eِٜ٘, reason: contains not printable characters */
    public int m4517e(int i, int i2) {
        while (i > i2) {
            char charAt = ((Layout) this.f36191e).getText().charAt(i - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((AbstractC7890e.yandex(charAt, 8192) < 0 || AbstractC7890e.yandex(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i;
            }
            i--;
        }
        return i;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: eؙٟ٘ */
    public void mo2123e(boolean z) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2123e(z);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: e٘ۡؗ */
    public boolean mo2124e() {
        return ((AbstractC11130e) this.f36191e).mo2124e();
    }

    /* renamed from: e۠۟, reason: contains not printable characters */
    public C1673e m4518e() {
        String str = ((AbstractC5113e) this.f36191e) == null ? " surface" : BuildConfig.FLAVOR;
        if (((List) this.f36190e) == null) {
            str = str.concat(" sharedSurfaces");
        }
        if (((Integer) this.f36192e) == null) {
            str = AbstractC10257e.adcel(str, " mirrorMode");
        }
        if (((Integer) this.f36189e) == null) {
            str = AbstractC10257e.adcel(str, " surfaceGroupId");
        }
        if (((C14677e) this.f36194e) == null) {
            str = AbstractC10257e.adcel(str, " dynamicRange");
        }
        if (str.isEmpty()) {
            return new C1673e((AbstractC5113e) this.f36191e, (List) this.f36190e, ((Integer) this.f36192e).intValue(), ((Integer) this.f36189e).intValue(), (C14677e) this.f36194e);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: final */
    public void mo2125final() {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2125final();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؚؖٞ, java.lang.Object] */
    /* renamed from: finally, reason: not valid java name */
    public InterfaceC3399e m4519finally(AbstractC1237e abstractC1237e, Function0 function0) {
        int i;
        int i2;
        ?? obj = new Object();
        obj.f8852e = -1;
        synchronized (this.f36191e) {
            Throwable th = (Throwable) this.f36190e;
            if (th != null) {
                abstractC1237e.vip(th);
                return C5438e.f11677e;
            }
            C11936e c11936e = (C11936e) this.f36192e;
            do {
                i = c11936e.get();
                i2 = i + 1;
            } while (!c11936e.compareAndSet(i, i2));
            boolean z = true;
            if ((134217727 & i2) != 1) {
                z = false;
            }
            obj.f8852e = (i2 >>> 27) & 15;
            ((C12328e) this.f36189e).ad(abstractC1237e);
            if (z && function0 != null) {
                try {
                    function0.invoke();
                } catch (Throwable th2) {
                    m4507e(th2);
                }
            }
            return new C11883e(new Csynchronized(1, abstractC1237e, this, obj));
        }
    }

    @Override // defpackage.InterfaceC16843e
    public C5298e firebase() {
        return ((AbstractC11130e) this.f36191e).firebase();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: for */
    public void mo2126for(float f) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2126for(f);
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        switch (this.f36193e) {
            case 8:
                return new C12878e((Executor) ((InterfaceC16964e) this.f36191e).get(), (C11833e) ((InterfaceC16964e) this.f36190e).get(), (C12894e) ((C6029e) this.f36192e).get(), (InterfaceC8685e) ((InterfaceC16964e) this.f36189e).get(), (InterfaceC1640e) ((InterfaceC16964e) this.f36194e).get());
            case 21:
                return new C17008e((C16723e) ((InterfaceC16964e) this.f36191e).get(), (InterfaceC4648e) ((InterfaceC16964e) this.f36190e).get(), (C10426e) ((InterfaceC16964e) this.f36192e).get(), (C6852e) ((InterfaceC16964e) this.f36189e).get(), (C9727e) ((InterfaceC18006e) this.f36194e).get());
            default:
                return new C6616e((C14679e) ((C15816e) this.f36191e).f31190e, (InterfaceC4648e) ((InterfaceC16964e) this.f36190e).get(), (C1253e) ((InterfaceC16964e) this.f36192e).get(), (C15176e) ((InterfaceC18006e) this.f36189e).get(), (InterfaceC8850e) ((InterfaceC16964e) this.f36194e).get());
        }
    }

    @Override // defpackage.InterfaceC16843e
    public long getDuration() {
        return ((AbstractC11130e) this.f36191e).getDuration();
    }

    @Override // defpackage.InterfaceC15813e
    /* renamed from: goto */
    public InterfaceC15813e mo2367goto(C11709e c11709e, C0520e c0520e) {
        return ((C14461e) this.f36191e).mo2367goto(c11709e, c0520e);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: implements */
    public C2351e mo2127implements() {
        return ((AbstractC11130e) this.f36191e).mo2127implements();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: import */
    public int mo2128import() {
        return ((AbstractC11130e) this.f36191e).mo2128import();
    }

    @Override // defpackage.InterfaceC2560e
    public Object inmobi(C16786e c16786e) {
        if (((Set) this.f36191e).contains(c16786e)) {
            return ((InterfaceC2560e) this.f36194e).inmobi(c16786e);
        }
        throw new C14803e("Attempting to request an undeclared dependency " + c16786e + ".", 2, (byte) 0);
    }

    /* renamed from: instanceof, reason: not valid java name */
    public void m4520instanceof(InterfaceC11094e interfaceC11094e, InterfaceC7227e interfaceC7227e) {
        ((ArrayList) this.f36189e).add(new C5625e(interfaceC11094e, interfaceC7227e, 2));
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: interface */
    public boolean mo2129interface() {
        return ((AbstractC11130e) this.f36191e).mo2129interface();
    }

    @Override // defpackage.InterfaceC16843e
    public int isPro() {
        return ((AbstractC11130e) this.f36191e).isPro();
    }

    @Override // defpackage.InterfaceC16843e
    public C4194e isVip() {
        return ((AbstractC11130e) this.f36191e).isVip();
    }

    @Override // defpackage.InterfaceC16843e
    public void license() {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).license();
    }

    @Override // defpackage.InterfaceC16843e
    public void loadAd() {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).loadAd();
    }

    @Override // defpackage.InterfaceC2560e
    public Set metrica(C16786e c16786e) {
        if (((Set) this.f36189e).contains(c16786e)) {
            return ((InterfaceC2560e) this.f36194e).metrica(c16786e);
        }
        throw new C14803e("Attempting to request an undeclared dependency Set<" + c16786e + ">.", 2, (byte) 0);
    }

    @Override // defpackage.InterfaceC15813e
    public void mopub() {
        ((C14461e) this.f36190e).mopub();
        C14461e c14461e = (C14461e) this.f36189e;
        ((HashMap) c14461e.f28587e).put((C0520e) this.f36194e, new AbstractC13656e((InterfaceC16566e) AbstractC13480e.m3590instanceof((ArrayList) this.f36192e)));
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: native */
    public void mo2130native(boolean z) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2130native(z);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: new */
    public C5251e mo2131new() {
        return ((AbstractC11130e) this.f36191e).mo2131new();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: package */
    public void mo2132package(int i, int i2) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2132package(i, i2);
    }

    @Override // defpackage.InterfaceC16843e
    public long premium() {
        return ((AbstractC11130e) this.f36191e).premium();
    }

    @Override // defpackage.InterfaceC16843e
    public void pro() {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).pro();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: protected */
    public void mo2133protected(InterfaceC8524e interfaceC8524e) {
        ((AbstractC11130e) this.f36191e).mo2133protected(interfaceC8524e);
        ((ArrayList) this.f36192e).add(interfaceC8524e);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: public */
    public C8256e mo2134public() {
        return ((AbstractC11130e) this.f36191e).mo2134public();
    }

    @Override // defpackage.InterfaceC16843e
    public void purchase(float f) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).purchase(f);
    }

    @Override // defpackage.InterfaceC16843e
    public void release() {
        AbstractC11130e abstractC11130e = (AbstractC11130e) this.f36189e;
        if (abstractC11130e != null) {
            abstractC11130e.release();
        }
        ((AbstractC11130e) this.f36191e).release();
        ((ArrayList) this.f36194e).clear();
    }

    @Override // defpackage.InterfaceC15813e
    public void remoteconfig(C0520e c0520e, C5302e c5302e) {
        ((C14461e) this.f36191e).remoteconfig(c0520e, c5302e);
    }

    /* renamed from: return, reason: not valid java name */
    public void m4521return(InterfaceC17863e interfaceC17863e, InterfaceC7227e interfaceC7227e) {
        ((ArrayList) this.f36190e).add(new C6571e(interfaceC17863e, interfaceC7227e));
    }

    @Override // defpackage.InterfaceC16843e
    public void signatures(int i) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).signatures(i);
    }

    @Override // defpackage.InterfaceC16843e
    public C3335e smaato() {
        return ((AbstractC11130e) this.f36191e).smaato();
    }

    @Override // defpackage.InterfaceC16843e
    public int startapp() {
        return ((AbstractC11130e) this.f36191e).startapp();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: static */
    public void mo2135static(int i, int i2, List list) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2135static(i, i2, list);
    }

    @Override // defpackage.InterfaceC16843e
    public void stop() {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).stop();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: strictfp */
    public void mo2136strictfp() {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2136strictfp();
    }

    @Override // defpackage.InterfaceC16843e
    public void subs(int i, long j) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).subs(i, j);
    }

    @Override // defpackage.InterfaceC16843e
    public boolean subscription() {
        return ((AbstractC11130e) this.f36191e).subscription();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: super */
    public void mo2137super(int i, boolean z) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2137super(i, z);
    }

    /* renamed from: switch, reason: not valid java name */
    public void m4522switch(InterfaceC6239e interfaceC6239e, InterfaceC7227e interfaceC7227e) {
        ((ArrayList) this.f36191e).add(new C6571e(interfaceC6239e, interfaceC7227e));
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: synchronized */
    public void mo2138synchronized(C4491e c4491e) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2138synchronized(c4491e);
    }

    @Override // defpackage.InterfaceC15813e
    public InterfaceC11429e tapsense(C0520e c0520e) {
        return ((C14461e) this.f36191e).tapsense(c0520e);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: this */
    public void mo2139this() {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2139this();
        ((ArrayList) this.f36194e).clear();
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: throws */
    public void mo2140throws(int i, int i2) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2140throws(i, i2);
        int i3 = i2 - i;
        while (true) {
            i3--;
            if (-1 >= i3) {
                return;
            } else {
                ((ArrayList) this.f36194e).remove(i + i3);
            }
        }
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: transient */
    public void mo2141transient(int i) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2141transient(i);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: try */
    public long mo2142try() {
        return ((AbstractC11130e) this.f36191e).mo2142try();
    }

    @Override // defpackage.InterfaceC15374e
    public boolean vip() {
        ArrayList arrayList = (ArrayList) this.f36192e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C17860e) arrayList.get(i)).ad.vip()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: volatile */
    public void mo2143volatile(SurfaceHolder surfaceHolder) {
        if (((AbstractC11130e) this.f36189e) != null) {
            m4505e();
        }
        ((AbstractC11130e) this.f36191e).mo2143volatile(surfaceHolder);
    }

    @Override // defpackage.InterfaceC16843e
    /* renamed from: while */
    public int mo2144while() {
        return ((AbstractC11130e) this.f36191e).mo2144while();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC15374e
    public float yandex() {
        return ((Number) this.f36189e.getValue()).floatValue();
    }
}
