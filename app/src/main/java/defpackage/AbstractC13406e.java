package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;
import org.xmlpull.v1.XmlPullParser;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkapi2.objects.music.playlist.thumb.AlbumThumb;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٞ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13406e {
    public static final C2892e ad = new C2892e(-957819804, false, new C0972e(15));
    public static final C2892e vip = new C2892e(-1465694771, false, new C11049e(15));
    public static final C2892e metrica = new C2892e(1980018564, false, new C11049e(16));

    public static final boolean Signature(AudioPlaylist audioPlaylist) {
        if (audioPlaylist.f36517protected != null && AbstractC7890e.billing(audioPlaylist.f36506extends, Boolean.TRUE)) {
            return true;
        }
        long j = audioPlaylist.applovin;
        C14027e.ad.getClass();
        return j == C14027e.metrica();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public static final boolean ad(C14718e c14718e) {
        ?? r5 = c14718e.f29124e.f7673e.ad;
        int size = r5.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (((C2401e) r5.get(i)).license) {
                z = true;
                break;
            }
            i++;
        }
        return !z;
    }

    public static String adcel(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (smaato(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static final boolean admob(AudioPlaylist audioPlaylist) {
        return audioPlaylist.isPro < 0;
    }

    public static final Uri advert(AudioPlaylist audioPlaylist) {
        String str;
        List list = audioPlaylist.f36505default;
        if (audioPlaylist.f36522synchronized) {
            return Uri.parse(AbstractC4224e.purchase(audioPlaylist.f36518return ? 1 : 5, signatures(audioPlaylist)).f21024e.remoteconfig());
        }
        if (list.isEmpty()) {
            AlbumThumb albumThumb = audioPlaylist.f36500abstract;
            if (albumThumb != null) {
                String str2 = albumThumb.appmetrica;
                if (str2 == null) {
                    str2 = albumThumb.license;
                }
                if (str2 != null) {
                    return Uri.parse(str2);
                }
            }
        } else {
            AlbumThumb albumThumb2 = (AlbumThumb) AbstractC13480e.m3604this(list);
            if (albumThumb2 == null || (str = albumThumb2.appmetrica) == null) {
                AlbumThumb albumThumb3 = (AlbumThumb) AbstractC13480e.m3604this(list);
                str = albumThumb3 != null ? albumThumb3.license : null;
            }
            if (str != null) {
                return Uri.parse(str);
            }
        }
        return null;
    }

    public static final boolean amazon(AudioPlaylist audioPlaylist) {
        return !audioPlaylist.f36507final.isEmpty();
    }

    public static final C8518e appmetrica(C14856e c14856e, int i, long j, C3497e c3497e, long j2, EnumC17426e enumC17426e, InterfaceC3886e interfaceC3886e, C14544e c14544e, EnumC7792e enumC7792e, int i2, C3123e c3123e) {
        List list;
        Object vip2 = c3497e.vip(i);
        List list2 = (List) c3123e.vip(i);
        if (list2 != null) {
            list = list2;
        } else {
            List ad2 = c14856e.ad(i);
            int size = ad2.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(((InterfaceC16719e) ad2.get(i3)).admob(j));
            }
            c3123e.startapp(i, arrayList);
            list = arrayList;
        }
        return new C8518e(i, i2, list, j2, vip2, enumC17426e, interfaceC3886e, c14544e, enumC7792e);
    }

    public static final MainArtist billing(AudioPlaylist audioPlaylist) {
        if (amazon(audioPlaylist)) {
            return (MainArtist) audioPlaylist.f36507final.get(0);
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(4:(1:(1:12)(2:42|43))(2:44|45)|13|14|(4:19|20|(6:22|23|(1:27)(1:25)|13|14|(2:16|17)(0))|30)(0))(7:46|47|23|(0)(0)|13|14|(0)(0)))(3:48|14|(0)(0))))|50|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (r11 == r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0045, code lost:
    
        if (kotlin.Unit.INSTANCE == r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
    
        if (kotlin.Unit.INSTANCE == r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0045, code lost:
    
        if (r11 != r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0048, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087 A[Catch: CancellationException -> 0x0048, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x0048, blocks: (B:23:0x0070, B:27:0x0087, B:45:0x0042, B:47:0x0050), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r0v2, types: [eًؗۖ, java.lang.Object, eْٓؑ, eُؑ۠] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r11v4, types: [eؘۣٔ, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r11v7, types: [eؘۣٔ, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11, types: [eؙٓؔ] */
    /* JADX WARN: Type inference failed for: r1v12, types: [eؙٓؔ] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [eؙٓؔ] */
    /* JADX WARN: Type inference failed for: r1v3, types: [eؙٓؔ] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r7v2, types: [eًؕ٘] */
    /* JADX WARN: Type inference failed for: r7v4, types: [eًؕ٘] */
    /* JADX WARN: Type inference failed for: r9v0, types: [eؙٓؔ] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11, types: [eٌِٞ] */
    /* JADX WARN: Type inference failed for: r9v13, types: [eٌِٞ] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2, types: [eٌِٞ] */
    /* JADX WARN: Type inference failed for: r9v3, types: [eٌِٞ] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object license(defpackage.InterfaceC13742e r9, kotlin.jvm.functions.Function2 r10, defpackage.AbstractC10731e r11) {
        /*
            boolean r0 = r11 instanceof defpackage.C13949e
            if (r0 == 0) goto L13
            r0 = r11
            eْٓؑ r0 = (defpackage.C13949e) r0
            int r1 = r0.f27666e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27666e = r1
            goto L18
        L13:
            eْٓؑ r0 = new eْٓؑ
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f27668e
            int r1 = r0.f27666e
            r2 = 0
            eٟؔۙ r3 = defpackage.EnumC2821e.f6782e
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L54
            if (r1 == r6) goto L4a
            if (r1 == r5) goto L3c
            if (r1 != r4) goto L34
            eٌِٞ r9 = r0.f27669e
            kotlin.jvm.functions.Function2 r10 = r0.f27665e
            eؙٓؔ r1 = r0.f27667e
            defpackage.AbstractC2003e.purchase(r11)
            goto L45
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            eٌِٞ r9 = r0.f27669e
            kotlin.jvm.functions.Function2 r10 = r0.f27665e
            eؙٓؔ r1 = r0.f27667e
            defpackage.AbstractC2003e.purchase(r11)     // Catch: java.util.concurrent.CancellationException -> L48
        L45:
            r11 = r9
            r9 = r1
            goto L59
        L48:
            r11 = move-exception
            goto L91
        L4a:
            eٌِٞ r9 = r0.f27669e
            kotlin.jvm.functions.Function2 r10 = r0.f27665e
            eؙٓؔ r1 = r0.f27667e
            defpackage.AbstractC2003e.purchase(r11)     // Catch: java.util.concurrent.CancellationException -> L48
            goto L70
        L54:
            defpackage.AbstractC2003e.purchase(r11)
            eٌِٞ r11 = r0.f21135e
        L59:
            boolean r1 = defpackage.AbstractC6629e.amazon(r11)
            if (r1 == 0) goto Lb4
            r0.f27667e = r9     // Catch: java.util.concurrent.CancellationException -> L8c
            r0.f27665e = r10     // Catch: java.util.concurrent.CancellationException -> L8c
            r0.f27669e = r11     // Catch: java.util.concurrent.CancellationException -> L8c
            r0.f27666e = r6     // Catch: java.util.concurrent.CancellationException -> L8c
            java.lang.Object r1 = r10.invoke(r9, r0)     // Catch: java.util.concurrent.CancellationException -> L8c
            if (r1 != r3) goto L6e
            goto Lb2
        L6e:
            r1 = r9
            r9 = r11
        L70:
            r0.f27667e = r1     // Catch: java.util.concurrent.CancellationException -> L48
            r0.f27665e = r10     // Catch: java.util.concurrent.CancellationException -> L48
            r0.f27669e = r9     // Catch: java.util.concurrent.CancellationException -> L48
            r0.f27666e = r5     // Catch: java.util.concurrent.CancellationException -> L48
            eؚٕؑ r11 = new eؚٕؑ     // Catch: java.util.concurrent.CancellationException -> L48
            r11.<init>(r5, r2)     // Catch: java.util.concurrent.CancellationException -> L48
            r7 = r1
            eًؕ٘ r7 = (defpackage.C3427e) r7     // Catch: java.util.concurrent.CancellationException -> L48
            java.lang.Object r11 = r7.m1364e(r11, r0)     // Catch: java.util.concurrent.CancellationException -> L48
            if (r11 != r3) goto L87
            goto L89
        L87:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch: java.util.concurrent.CancellationException -> L48
        L89:
            if (r11 != r3) goto L45
            goto Lb2
        L8c:
            r1 = move-exception
            r8 = r1
            r1 = r9
            r9 = r11
            r11 = r8
        L91:
            boolean r7 = defpackage.AbstractC6629e.amazon(r9)
            if (r7 == 0) goto Lb3
            r0.f27667e = r1
            r0.f27665e = r10
            r0.f27669e = r9
            r0.f27666e = r4
            eؚٕؑ r11 = new eؚٕؑ
            r11.<init>(r5, r2)
            r7 = r1
            eًؕ٘ r7 = (defpackage.C3427e) r7
            java.lang.Object r11 = r7.m1364e(r11, r0)
            if (r11 != r3) goto Lae
            goto Lb0
        Lae:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        Lb0:
            if (r11 != r3) goto L45
        Lb2:
            return r3
        Lb3:
            throw r11
        Lb4:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC13406e.license(eؙٓؔ, kotlin.jvm.functions.Function2, eُؑ۠):java.lang.Object");
    }

    public static final boolean loadAd(AudioPlaylist audioPlaylist) {
        long j = audioPlaylist.applovin;
        C14027e.ad.getClass();
        return j == C14027e.metrica() && audioPlaylist.f36517protected == null;
    }

    public static final Object metrica(InterfaceC13742e interfaceC13742e, Function2 function2, InterfaceC5083e interfaceC5083e) {
        Object m1364e = ((C3427e) interfaceC13742e).m1364e(new license(interfaceC5083e.admob(), function2, (InterfaceC5083e) null), interfaceC5083e);
        return m1364e == EnumC2821e.f6782e ? m1364e : Unit.INSTANCE;
    }

    public static final String mopub(AudioPlaylist audioPlaylist) {
        List list = audioPlaylist.f36505default;
        if (!list.isEmpty()) {
            String str = ((AlbumThumb) list.get(0)).appmetrica;
            return str == null ? ((AlbumThumb) list.get(0)).license : str;
        }
        AlbumThumb albumThumb = audioPlaylist.f36500abstract;
        if (albumThumb == null) {
            return null;
        }
        String str2 = albumThumb.appmetrica;
        return str2 == null ? albumThumb.license : str2;
    }

    public static final String pro(AudioPlaylist audioPlaylist) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(audioPlaylist.applovin);
        sb.append('_');
        sb.append(audioPlaylist.isPro);
        String str2 = audioPlaylist.f36509implements;
        if (str2 == null || str2.length() == 0) {
            str = BuildConfig.FLAVOR;
        } else {
            str = "_" + str2;
        }
        sb.append(str);
        return sb.toString();
    }

    public static int purchase(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static final String remoteconfig(AudioPlaylist audioPlaylist) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(audioPlaylist.applovin);
        sb.append('_');
        sb.append(audioPlaylist.isPro);
        String str2 = audioPlaylist.f36509implements;
        if (str2 == null || str2.length() == 0) {
            str = BuildConfig.FLAVOR;
        } else {
            str = "/" + str2;
        }
        sb.append(str);
        return sb.toString();
    }

    public static final String signatures(AudioPlaylist audioPlaylist) {
        StringBuilder sb = new StringBuilder();
        sb.append(audioPlaylist.applovin);
        sb.append('_');
        sb.append(audioPlaylist.isPro);
        return sb.toString();
    }

    public static boolean smaato(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static Csuper startapp(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        Csuper csuper;
        boolean smaato = smaato(xmlPullParser, str);
        Object obj = null;
        int i2 = 0;
        if (smaato) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new Csuper(obj, obj, typedValue.data, 6);
            }
            try {
                csuper = Csuper.amazon(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                csuper = null;
            }
            if (csuper != null) {
                return csuper;
            }
        }
        return new Csuper(obj, obj, i2, 6);
    }

    public static TypedArray subscription(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        if (ad(r6) == false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0049 -> B:10:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object vip(defpackage.C14718e r6, defpackage.EnumC13456e r7, defpackage.AbstractC9049e r8) {
        /*
            boolean r0 = r8 instanceof defpackage.C4918e
            if (r0 == 0) goto L13
            r0 = r8
            eٖؗؒ r0 = (defpackage.C4918e) r0
            int r1 = r0.f10421e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10421e = r1
            goto L18
        L13:
            eٖؗؒ r0 = new eٖؗؒ
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f10422e
            int r1 = r0.f10421e
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            eْۘٞ r6 = r0.f10419e
            eِٔٔ r7 = r0.f10420e
            defpackage.AbstractC2003e.purchase(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L4c
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.AbstractC2003e.purchase(r8)
            boolean r8 = ad(r6)
            if (r8 != 0) goto L65
        L3d:
            r0.f10420e = r6
            r0.f10419e = r7
            r0.f10421e = r2
            java.lang.Object r8 = r6.metrica(r7, r0)
            eٟؔۙ r1 = defpackage.EnumC2821e.f6782e
            if (r8 != r1) goto L4c
            return r1
        L4c:
            eؔٓؔ r8 = (defpackage.C2561e) r8
            java.lang.Object r8 = r8.ad
            int r1 = r8.size()
            r3 = 0
        L55:
            if (r3 >= r1) goto L65
            java.lang.Object r4 = r8.get(r3)
            eؘؔٞ r4 = (defpackage.C2401e) r4
            boolean r4 = r4.license
            if (r4 == 0) goto L62
            goto L3d
        L62:
            int r3 = r3 + 1
            goto L55
        L65:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC13406e.vip(eِٔٔ, eْۘٞ, eٌۡۖ):java.lang.Object");
    }

    public static ColorStateList yandex(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (!smaato(xmlPullParser, "tint")) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        int i = typedValue.type;
        if (i == 2) {
            throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
        }
        if (i >= 28 && i <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        Resources resources = typedArray.getResources();
        int resourceId = typedArray.getResourceId(1, 0);
        ThreadLocal threadLocal = AbstractC11195e.ad;
        try {
            return AbstractC11195e.ad(resources, resources.getXml(resourceId), theme);
        } catch (Exception e) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
            return null;
        }
    }
}
