package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e(with = C12069e.class)
/* renamed from: eٌؙٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6399e implements Serializable {
    public static final C7859e Companion = new Object();

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final String f13260e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C5363e f13261e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C5363e f13262e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC11129e f13263e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final C16063e f13264e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final C5363e f13265e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f13266e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C5363e f13267e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final C5363e f13268e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final ArrayList f13269e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C16063e f13270e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final String f13271e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C5363e f13272e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f13273e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final String f13274e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final boolean f13275e;

    public C6399e(C16063e c16063e, String str, int i, ArrayList arrayList, InterfaceC11129e interfaceC11129e, String str2, String str3, boolean z, String str4) {
        this.f13273e = str;
        this.f13266e = i;
        this.f13263e = interfaceC11129e;
        this.f13271e = str2;
        this.f13260e = str3;
        this.f13275e = z;
        this.f13274e = str4;
        if (i < 0 || i >= 65536) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "Port must be between 0 and 65535, or 0 if not set. Provided: ").toString());
        }
        this.f13269e = arrayList;
        this.f13272e = new C5363e(new C4175e(1, arrayList));
        this.f13264e = c16063e;
        this.f13270e = c16063e == null ? C16063e.f31627e : c16063e;
        this.f13262e = new C5363e(new C16200e(arrayList, this, 4));
        final int i2 = 0;
        this.f13261e = new C5363e(new Function0(this) { // from class: eٌِۚ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C6399e f17976e;

            {
                this.f17976e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                C6399e c6399e = this.f17976e;
                switch (i3) {
                    case 0:
                        String str5 = c6399e.f13274e;
                        int m1865interface = AbstractC5304e.m1865interface(str5, '?', 0, 6) + 1;
                        if (m1865interface == 0) {
                            return BuildConfig.FLAVOR;
                        }
                        int m1865interface2 = AbstractC5304e.m1865interface(str5, '#', m1865interface, 4);
                        return m1865interface2 == -1 ? str5.substring(m1865interface) : str5.substring(m1865interface, m1865interface2);
                    case 1:
                        String str6 = c6399e.f13274e;
                        String str7 = c6399e.f13271e;
                        if (str7 == null) {
                            return null;
                        }
                        if (str7.length() == 0) {
                            return BuildConfig.FLAVOR;
                        }
                        int length = c6399e.f13270e.f31630e.length() + 3;
                        return str6.substring(length, AbstractC5304e.m1877this(str6, new char[]{':', '@'}, length, false));
                    case 2:
                        String str8 = c6399e.f13274e;
                        String str9 = c6399e.f13260e;
                        if (str9 == null) {
                            return null;
                        }
                        return str9.length() == 0 ? BuildConfig.FLAVOR : str8.substring(AbstractC5304e.m1865interface(str8, ':', c6399e.f13270e.f31630e.length() + 3, 4) + 1, AbstractC5304e.m1865interface(str8, '@', 0, 6));
                    default:
                        String str10 = c6399e.f13274e;
                        int m1865interface3 = AbstractC5304e.m1865interface(str10, '#', 0, 6) + 1;
                        return m1865interface3 == 0 ? BuildConfig.FLAVOR : str10.substring(m1865interface3);
                }
            }
        });
        final int i3 = 1;
        this.f13265e = new C5363e(new Function0(this) { // from class: eٌِۚ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C6399e f17976e;

            {
                this.f17976e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                C6399e c6399e = this.f17976e;
                switch (i32) {
                    case 0:
                        String str5 = c6399e.f13274e;
                        int m1865interface = AbstractC5304e.m1865interface(str5, '?', 0, 6) + 1;
                        if (m1865interface == 0) {
                            return BuildConfig.FLAVOR;
                        }
                        int m1865interface2 = AbstractC5304e.m1865interface(str5, '#', m1865interface, 4);
                        return m1865interface2 == -1 ? str5.substring(m1865interface) : str5.substring(m1865interface, m1865interface2);
                    case 1:
                        String str6 = c6399e.f13274e;
                        String str7 = c6399e.f13271e;
                        if (str7 == null) {
                            return null;
                        }
                        if (str7.length() == 0) {
                            return BuildConfig.FLAVOR;
                        }
                        int length = c6399e.f13270e.f31630e.length() + 3;
                        return str6.substring(length, AbstractC5304e.m1877this(str6, new char[]{':', '@'}, length, false));
                    case 2:
                        String str8 = c6399e.f13274e;
                        String str9 = c6399e.f13260e;
                        if (str9 == null) {
                            return null;
                        }
                        return str9.length() == 0 ? BuildConfig.FLAVOR : str8.substring(AbstractC5304e.m1865interface(str8, ':', c6399e.f13270e.f31630e.length() + 3, 4) + 1, AbstractC5304e.m1865interface(str8, '@', 0, 6));
                    default:
                        String str10 = c6399e.f13274e;
                        int m1865interface3 = AbstractC5304e.m1865interface(str10, '#', 0, 6) + 1;
                        return m1865interface3 == 0 ? BuildConfig.FLAVOR : str10.substring(m1865interface3);
                }
            }
        });
        final int i4 = 2;
        this.f13267e = new C5363e(new Function0(this) { // from class: eٌِۚ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C6399e f17976e;

            {
                this.f17976e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i4;
                C6399e c6399e = this.f17976e;
                switch (i32) {
                    case 0:
                        String str5 = c6399e.f13274e;
                        int m1865interface = AbstractC5304e.m1865interface(str5, '?', 0, 6) + 1;
                        if (m1865interface == 0) {
                            return BuildConfig.FLAVOR;
                        }
                        int m1865interface2 = AbstractC5304e.m1865interface(str5, '#', m1865interface, 4);
                        return m1865interface2 == -1 ? str5.substring(m1865interface) : str5.substring(m1865interface, m1865interface2);
                    case 1:
                        String str6 = c6399e.f13274e;
                        String str7 = c6399e.f13271e;
                        if (str7 == null) {
                            return null;
                        }
                        if (str7.length() == 0) {
                            return BuildConfig.FLAVOR;
                        }
                        int length = c6399e.f13270e.f31630e.length() + 3;
                        return str6.substring(length, AbstractC5304e.m1877this(str6, new char[]{':', '@'}, length, false));
                    case 2:
                        String str8 = c6399e.f13274e;
                        String str9 = c6399e.f13260e;
                        if (str9 == null) {
                            return null;
                        }
                        return str9.length() == 0 ? BuildConfig.FLAVOR : str8.substring(AbstractC5304e.m1865interface(str8, ':', c6399e.f13270e.f31630e.length() + 3, 4) + 1, AbstractC5304e.m1865interface(str8, '@', 0, 6));
                    default:
                        String str10 = c6399e.f13274e;
                        int m1865interface3 = AbstractC5304e.m1865interface(str10, '#', 0, 6) + 1;
                        return m1865interface3 == 0 ? BuildConfig.FLAVOR : str10.substring(m1865interface3);
                }
            }
        });
        final int i5 = 3;
        this.f13268e = new C5363e(new Function0(this) { // from class: eٌِۚ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C6399e f17976e;

            {
                this.f17976e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i5;
                C6399e c6399e = this.f17976e;
                switch (i32) {
                    case 0:
                        String str5 = c6399e.f13274e;
                        int m1865interface = AbstractC5304e.m1865interface(str5, '?', 0, 6) + 1;
                        if (m1865interface == 0) {
                            return BuildConfig.FLAVOR;
                        }
                        int m1865interface2 = AbstractC5304e.m1865interface(str5, '#', m1865interface, 4);
                        return m1865interface2 == -1 ? str5.substring(m1865interface) : str5.substring(m1865interface, m1865interface2);
                    case 1:
                        String str6 = c6399e.f13274e;
                        String str7 = c6399e.f13271e;
                        if (str7 == null) {
                            return null;
                        }
                        if (str7.length() == 0) {
                            return BuildConfig.FLAVOR;
                        }
                        int length = c6399e.f13270e.f31630e.length() + 3;
                        return str6.substring(length, AbstractC5304e.m1877this(str6, new char[]{':', '@'}, length, false));
                    case 2:
                        String str8 = c6399e.f13274e;
                        String str9 = c6399e.f13260e;
                        if (str9 == null) {
                            return null;
                        }
                        return str9.length() == 0 ? BuildConfig.FLAVOR : str8.substring(AbstractC5304e.m1865interface(str8, ':', c6399e.f13270e.f31630e.length() + 3, 4) + 1, AbstractC5304e.m1865interface(str8, '@', 0, 6));
                    default:
                        String str10 = c6399e.f13274e;
                        int m1865interface3 = AbstractC5304e.m1865interface(str10, '#', 0, 6) + 1;
                        return m1865interface3 == 0 ? BuildConfig.FLAVOR : str10.substring(m1865interface3);
                }
            }
        });
    }

    public final List ad() {
        return (List) this.f13272e.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C6399e.class != obj.getClass()) {
            return false;
        }
        return AbstractC7890e.billing(this.f13274e, ((C6399e) obj).f13274e);
    }

    public final int hashCode() {
        return this.f13274e.hashCode();
    }

    public final String toString() {
        return this.f13274e;
    }
}
