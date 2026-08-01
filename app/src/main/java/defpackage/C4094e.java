package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؖٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C4094e {
    public final /* synthetic */ int ad;
    public static final C2892e vip = new C2892e(289804370, false, new C12341e(10));
    public static final C2892e metrica = new C2892e(2020862877, false, new C14866e(16));
    public static final C2892e license = new C2892e(-346395193, false, new C14866e(17));

    public /* synthetic */ C4094e(int i) {
        this.ad = i;
    }

    public static final byte[] ad(long j) {
        return (AbstractC17202e.appmetrica(j, 0L) < 0 || AbstractC17202e.appmetrica(j, ((long) 23) & 4294967295L) > 0) ? (AbstractC17202e.appmetrica(j, ((long) 24) & 4294967295L) < 0 || AbstractC17202e.appmetrica(j, ((long) 255) & 4294967295L) > 0) ? (AbstractC17202e.appmetrica(j, ((long) 65535) & 4294967295L) > 0 || AbstractC17202e.appmetrica(j, ((long) PSKKeyManager.MAX_KEY_LENGTH_BYTES) & 4294967295L) < 0) ? (AbstractC17202e.appmetrica(j, ((long) 65536) & 4294967295L) < 0 || AbstractC17202e.appmetrica(j, ((long) (-1)) & 4294967295L) > 0) ? purchase(j, 8, (byte) 27) : purchase(j, 4, (byte) 26) : purchase(j, 2, (byte) 25) : new byte[]{24, (byte) j} : new byte[]{(byte) j};
    }

    public static final void appmetrica(C17041e c17041e, long j) {
        byte[] ad;
        if (j >= 0) {
            ad = ad(j);
        } else {
            ad = ad(j == Long.MIN_VALUE ? Long.MAX_VALUE : (-1) - j);
            ad[0] = (byte) (ad[0] | 32);
        }
        C17041e.startapp(c17041e, ad, 0, 6);
    }

    public static final void billing(C17041e c17041e, long j, int i, int i2) {
        int i3 = (i * 8) - 8;
        c17041e.yandex(i2);
        for (int i4 = 0; i4 < i; i4++) {
            c17041e.yandex((int) ((j >>> (i3 - (i4 * 8))) & 255));
        }
    }

    public static void mopub(int[] iArr, int[] iArr2) {
        AbstractC16091e.applovin(iArr, iArr2);
        long j = 4294967295L;
        long j2 = iArr[6] & 4294967295L;
        int i = 5;
        int i2 = 12;
        int i3 = 0;
        while (true) {
            int i4 = i - 1;
            long j3 = iArr[i + 6] & j;
            long j4 = j3 * j3;
            long j5 = j;
            iArr2[i2 + 11] = ((int) (j4 >>> 33)) | (i3 << 31);
            int i5 = i2 - 2;
            iArr2[i2 + 10] = (int) (j4 >>> 1);
            i3 = (int) j4;
            if (i4 <= 0) {
                long j6 = j2 * j2;
                iArr2[12] = (int) j6;
                long j7 = iArr[7] & j5;
                long j8 = (j7 * j2) + (((i3 << 31) & j5) | (j6 >>> 33));
                int i6 = (int) j8;
                iArr2[13] = (i6 << 1) | (((int) (j6 >>> 32)) & 1);
                long j9 = (iArr2[14] & j5) + (j8 >>> 32);
                long j10 = iArr[8] & j5;
                long j11 = (j10 * j2) + j9;
                int i7 = (int) j11;
                iArr2[14] = (i7 << 1) | (i6 >>> 31);
                long amazon = AbstractC1786e.amazon(j10, j7, j11 >>> 32, iArr2[15] & j5);
                long j12 = (iArr2[16] & j5) + (amazon >>> 32);
                long j13 = iArr[9] & j5;
                long j14 = (iArr2[17] & j5) + (j12 >>> 32);
                long j15 = j12 & j5;
                long j16 = (iArr2[18] & j5) + (j14 >>> 32);
                long j17 = j14 & j5;
                long j18 = (j13 * j2) + (amazon & j5);
                int i8 = (int) j18;
                iArr2[15] = (i8 << 1) | (i7 >>> 31);
                long amazon2 = AbstractC1786e.amazon(j13, j7, j18 >>> 32, j15);
                long amazon3 = AbstractC1786e.amazon(j13, j10, amazon2 >>> 32, j17);
                long j19 = j16 + (amazon3 >>> 32);
                long j20 = amazon3 & j5;
                long j21 = iArr[10] & j5;
                long j22 = (iArr2[19] & j5) + (j19 >>> 32);
                long j23 = j19 & j5;
                long j24 = (iArr2[20] & j5) + (j22 >>> 32);
                long j25 = j22 & j5;
                long j26 = (j21 * j2) + (amazon2 & j5);
                int i9 = (int) j26;
                iArr2[16] = (i9 << 1) | (i8 >>> 31);
                long amazon4 = AbstractC1786e.amazon(j21, j7, j26 >>> 32, j20);
                long amazon5 = AbstractC1786e.amazon(j21, j10, amazon4 >>> 32, j23);
                long amazon6 = AbstractC1786e.amazon(j21, j13, amazon5 >>> 32, j25);
                long j27 = j24 + (amazon6 >>> 32);
                long j28 = amazon6 & j5;
                long j29 = iArr[11] & j5;
                long j30 = (iArr2[21] & j5) + (j27 >>> 32);
                long j31 = j27 & j5;
                long j32 = (iArr2[22] & j5) + (j30 >>> 32);
                long j33 = j30 & j5;
                long j34 = (j29 * j2) + (amazon4 & j5);
                int i10 = (int) j34;
                iArr2[17] = (i10 << 1) | (i9 >>> 31);
                long amazon7 = AbstractC1786e.amazon(j29, j7, j34 >>> 32, amazon5 & j5);
                long amazon8 = AbstractC1786e.amazon(j29, j10, amazon7 >>> 32, j28);
                long amazon9 = AbstractC1786e.amazon(j29, j13, amazon8 >>> 32, j31);
                long amazon10 = AbstractC1786e.amazon(j29, j21, amazon9 >>> 32, j33);
                long j35 = j32 + (amazon10 >>> 32);
                int i11 = (int) amazon7;
                iArr2[18] = (i10 >>> 31) | (i11 << 1);
                int i12 = (int) amazon8;
                iArr2[19] = (i11 >>> 31) | (i12 << 1);
                int i13 = (int) amazon9;
                iArr2[20] = (i12 >>> 31) | (i13 << 1);
                int i14 = i13 >>> 31;
                int i15 = (int) amazon10;
                iArr2[21] = i14 | (i15 << 1);
                int i16 = i15 >>> 31;
                int i17 = (int) j35;
                iArr2[22] = i16 | (i17 << 1);
                iArr2[23] = ((iArr2[23] + ((int) (j35 >>> 32))) << 1) | (i17 >>> 31);
                int license2 = AbstractC16091e.license(iArr2, iArr2);
                int metrica2 = AbstractC16091e.metrica(18, 12, iArr2, iArr2, AbstractC16091e.metrica(0, 6, iArr2, iArr2, 0) + license2) + license2;
                int[] iArr3 = new int[6];
                AbstractC16091e.startapp(iArr, iArr, iArr3);
                int[] iArr4 = new int[12];
                AbstractC16091e.applovin(iArr3, iArr4);
                AbstractC12797e.purchase(24, AbstractC12797e.m3399goto(12, 6, iArr4, iArr2) + metrica2, 18, iArr2);
                return;
            }
            i2 = i5;
            i = i4;
            j = j5;
        }
    }

    public static final byte[] purchase(long j, int i, byte b) {
        byte[] bArr = new byte[i + 1];
        int i2 = (i * 8) - 8;
        int i3 = 0;
        bArr[0] = b;
        while (i3 < i) {
            int i4 = i3 + 1;
            bArr[i4] = (byte) ((j >>> (i2 - (i3 * 8))) & 255);
            i3 = i4;
        }
        return bArr;
    }

    public static void startapp(int[] iArr, int[] iArr2, int[] iArr3) {
        AbstractC16091e.signatures(iArr, iArr2, iArr3);
        long j = iArr2[6] & 4294967295L;
        long j2 = iArr2[7] & 4294967295L;
        long j3 = iArr2[8] & 4294967295L;
        long j4 = iArr2[9] & 4294967295L;
        long j5 = iArr2[10] & 4294967295L;
        long j6 = iArr2[11] & 4294967295L;
        long j7 = iArr[6] & 4294967295L;
        long j8 = j7 * j;
        iArr3[12] = (int) j8;
        long j9 = (j7 * j2) + (j8 >>> 32);
        iArr3[13] = (int) j9;
        long j10 = (j7 * j3) + (j9 >>> 32);
        iArr3[14] = (int) j10;
        long j11 = (j7 * j4) + (j10 >>> 32);
        iArr3[15] = (int) j11;
        long j12 = (j7 * j5) + (j11 >>> 32);
        iArr3[16] = (int) j12;
        long j13 = (j7 * j6) + (j12 >>> 32);
        iArr3[17] = (int) j13;
        iArr3[18] = (int) (j13 >>> 32);
        int i = 12;
        int i2 = 1;
        while (i2 < 6) {
            int i3 = i + 1;
            int i4 = i2;
            long j14 = iArr[6 + i2] & 4294967295L;
            long j15 = j3;
            long j16 = (j14 * j) + (iArr3[i3] & 4294967295L);
            iArr3[i3] = (int) j16;
            long j17 = (j14 * j2) + (iArr3[r3] & 4294967295L) + (j16 >>> 32);
            iArr3[i + 2] = (int) j17;
            long j18 = (j14 * j15) + (iArr3[r5] & 4294967295L) + (j17 >>> 32);
            iArr3[i + 3] = (int) j18;
            long j19 = (j14 * j4) + (iArr3[r5] & 4294967295L) + (j18 >>> 32);
            iArr3[i + 4] = (int) j19;
            long j20 = (j14 * j5) + (iArr3[r5] & 4294967295L) + (j19 >>> 32);
            iArr3[i + 5] = (int) j20;
            long j21 = (j14 * j6) + (iArr3[r5] & 4294967295L) + (j20 >>> 32);
            iArr3[i + 6] = (int) j21;
            iArr3[i + 7] = (int) (j21 >>> 32);
            i2 = i4 + 1;
            i = i3;
            j3 = j15;
        }
        int license2 = AbstractC16091e.license(iArr3, iArr3);
        int metrica2 = AbstractC16091e.metrica(18, 12, iArr3, iArr3, AbstractC16091e.metrica(0, 6, iArr3, iArr3, 0) + license2) + license2;
        int[] iArr4 = new int[6];
        int[] iArr5 = new int[6];
        boolean z = AbstractC16091e.startapp(iArr, iArr, iArr4) != AbstractC16091e.startapp(iArr2, iArr2, iArr5);
        int[] iArr6 = new int[12];
        AbstractC16091e.signatures(iArr4, iArr5, iArr6);
        AbstractC12797e.purchase(24, metrica2 + (z ? AbstractC12797e.license(12, 6, iArr6, iArr3) : AbstractC12797e.m3399goto(12, 6, iArr6, iArr3)), 18, iArr3);
    }

    public static final void vip(C17041e c17041e, long j, int i) {
        if (AbstractC17202e.appmetrica(j, 0L) >= 0 && AbstractC17202e.appmetrica(j, 23 & 4294967295L) <= 0) {
            c17041e.yandex(((int) j) | i);
            return;
        }
        if (AbstractC17202e.appmetrica(j, 24 & 4294967295L) >= 0 && AbstractC17202e.appmetrica(j, 255 & 4294967295L) <= 0) {
            c17041e.yandex(i | 24);
            c17041e.yandex((int) j);
        } else if (AbstractC17202e.appmetrica(j, 65535 & 4294967295L) <= 0 && AbstractC17202e.appmetrica(j, PSKKeyManager.MAX_KEY_LENGTH_BYTES & 4294967295L) >= 0) {
            billing(c17041e, j, 2, i | 25);
        } else if (AbstractC17202e.appmetrica(j, 65536 & 4294967295L) < 0 || AbstractC17202e.appmetrica(j, 4294967295L & (-1)) > 0) {
            billing(c17041e, j, 8, i | 27);
        } else {
            billing(c17041e, j, 4, i | 26);
        }
    }

    public static String yandex(AbstractC10498e abstractC10498e) {
        StringBuilder sb = new StringBuilder(abstractC10498e.size());
        for (int i = 0; i < abstractC10498e.size(); i++) {
            byte appmetrica = abstractC10498e.appmetrica(i);
            if (appmetrica == 34) {
                sb.append("\\\"");
            } else if (appmetrica == 39) {
                sb.append("\\'");
            } else if (appmetrica != 92) {
                switch (appmetrica) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (appmetrica < 32 || appmetrica > 126) {
                            sb.append('\\');
                            sb.append((char) (((appmetrica >>> 6) & 3) + 48));
                            sb.append((char) (((appmetrica >>> 3) & 7) + 48));
                            sb.append((char) ((appmetrica & 7) + 48));
                            break;
                        } else {
                            sb.append((char) appmetrica);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public final Object adcel(Intent intent, int i) {
        List arrayList;
        switch (this.ad) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    return intent.getData();
                }
                return null;
            case 1:
                if (i != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                Uri data = intent.getData();
                if (data != null) {
                    return data;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Uri data2 = intent.getData();
                if (data2 != null) {
                    linkedHashSet.add(data2);
                }
                ClipData clipData = intent.getClipData();
                if (clipData == null && linkedHashSet.isEmpty()) {
                    arrayList = C13664e.f27089e;
                } else {
                    if (clipData != null) {
                        int itemCount = clipData.getItemCount();
                        for (int i2 = 0; i2 < itemCount; i2++) {
                            Uri uri = clipData.getItemAt(i2).getUri();
                            if (uri != null) {
                                linkedHashSet.add(uri);
                            }
                        }
                    }
                    arrayList = new ArrayList(linkedHashSet);
                }
                return (Uri) AbstractC13480e.m3604this(arrayList);
            case 2:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList2 = new ArrayList(intArrayExtra.length);
                        for (int i3 : intArrayExtra) {
                            arrayList2.add(Boolean.valueOf(i3 == 0));
                        }
                        return AbstractC10064e.mopub(AbstractC13480e.m3579e(arrayList2, AbstractC1660e.isPro(stringArrayExtra)));
                    }
                }
                return C9139e.f18290e;
            case 3:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z = false;
                if (intArrayExtra2 != null) {
                    int length = intArrayExtra2.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length) {
                            if (intArrayExtra2[i4] == 0) {
                                z = true;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                return new C13381e(intent, i);
            default:
                return new C13381e(intent, i);
        }
    }

    public Intent license(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.ad) {
            case 0:
                return metrica(context, (Uri) obj);
            case 1:
                C3394e c3394e = (C3394e) obj;
                if (AbstractC5096e.advert()) {
                    Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                    intent.setType(AbstractC5096e.adcel(c3394e.ad));
                    c3394e.vip.getClass();
                    intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                    return intent;
                }
                if (context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) == null) {
                    Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent2.setType(AbstractC5096e.adcel(c3394e.ad));
                    if (intent2.getType() != null) {
                        return intent2;
                    }
                    intent2.setType("*/*");
                    intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                    return intent2;
                }
                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
                if (resolveActivity == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ActivityInfo activityInfo = resolveActivity.activityInfo;
                Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent3.setType(AbstractC5096e.adcel(c3394e.ad));
                c3394e.vip.getClass();
                intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                return intent3;
            case 2:
                return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
            case 3:
                return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{(String) obj});
            case 4:
                return (Intent) obj;
            default:
                C6307e c6307e = (C6307e) obj;
                Intent intent4 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent5 = c6307e.f13134e;
                if (intent5 != null && (bundleExtra = intent5.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent4.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent5.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent5.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        c6307e = new C6307e(c6307e.f13136e, null, c6307e.f13133e, c6307e.f13135e);
                    }
                }
                intent4.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c6307e);
                if (AbstractC15958e.m4045native(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent4);
                }
                return intent4;
        }
    }

    public Intent metrica(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
        if (Build.VERSION.SDK_INT >= 26 && uri != null) {
            intent.putExtra("android.provider.extra.INITIAL_URI", uri);
        }
        return intent;
    }
}
