package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13182e extends AbstractC16997e {

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public static final /* synthetic */ int f26171e = 0;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final C0576e f26172e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final Function1 f26173e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public File f26174e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public final C0576e f26175e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public final C11952e f26176e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final C0576e f26177e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C0576e f26178e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public boolean f26179e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final AudioPlaylist f26180e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C0576e f26181e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C0576e f26182e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C0576e f26183e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13182e(Function1 function1, AudioPlaylist audioPlaylist, List list, int i) {
        super(false, 3);
        audioPlaylist = (i & 2) != 0 ? null : audioPlaylist;
        list = (i & 4) != 0 ? C13664e.f27089e : list;
        this.f26173e = function1;
        this.f26180e = audioPlaylist;
        Boolean bool = Boolean.FALSE;
        this.f26183e = AbstractC14533e.startapp(bool);
        this.f26172e = AbstractC14533e.startapp(bool);
        String str = audioPlaylist != null ? audioPlaylist.subs : null;
        String str2 = BuildConfig.FLAVOR;
        this.f26178e = AbstractC14533e.startapp(str == null ? BuildConfig.FLAVOR : str);
        String str3 = audioPlaylist != null ? audioPlaylist.crashlytics : null;
        this.f26181e = AbstractC14533e.startapp(str3 != null ? str3 : str2);
        this.f26182e = AbstractC14533e.startapp(Boolean.valueOf(audioPlaylist != null ? audioPlaylist.f36514new : false));
        this.f26177e = AbstractC14533e.startapp(null);
        this.f26175e = AbstractC14533e.startapp(AbstractC8228e.license(list));
        C11952e c11952e = new C11952e();
        for (AudioTrack audioTrack : list) {
            audioTrack.getClass();
            c11952e.put(AbstractC6914e.billing(audioTrack), this.f26180e != null ? EnumC10584e.f20887e : EnumC10584e.f20885e);
        }
        this.f26176e = c11952e;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [android.graphics.ImageDecoder$OnHeaderDecodedListener, java.lang.Object] */
    public static Unit inmobi(C13182e c13182e, Uri uri) {
        C0576e c0576e = c13182e.f26177e;
        if (uri != null) {
            Bitmap decodeBitmap = Build.VERSION.SDK_INT >= 28 ? ImageDecoder.decodeBitmap(ImageDecoder.createSource(c13182e.f10582e.getContentResolver(), uri), new Object()) : MediaStore.Images.Media.getBitmap(c13182e.f10582e.getContentResolver(), uri);
            float f = 600;
            float width = decodeBitmap.getWidth();
            float height = decodeBitmap.getHeight();
            float max = Math.max(f / width, f / height);
            float f2 = width * max;
            float f3 = max * height;
            float f4 = (f - f2) / 2.0f;
            float f5 = (f - f3) / 2.0f;
            RectF rectF = new RectF(f4, f5, f2 + f4, f3 + f5);
            Bitmap createBitmap = Bitmap.createBitmap(600, 600, decodeBitmap.getConfig());
            new Canvas(createBitmap).drawBitmap(decodeBitmap, (Rect) null, rectF, (Paint) null);
            c13182e.f26179e = false;
            C16241e.f31918e.getClass();
            VKXApplication vKXApplication = VKXApplication.f36528e;
            File file = new File((vKXApplication != null ? vKXApplication : null).getDir("artworkCache", 0), "VKXPlaylistCoverCache.png");
            if (file.exists()) {
                file.delete();
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            createBitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
            bufferedOutputStream.close();
            c13182e.f26174e = file;
            c0576e.setValue(new C1362e(createBitmap));
        } else {
            c13182e.f26179e = true;
            c0576e.setValue(null);
        }
        c13182e.isPro();
        return Unit.INSTANCE;
    }

    public static void isVip(ImageDecoder imageDecoder) {
        imageDecoder.setAllocator(1);
    }

    @Override // defpackage.AbstractC5004e
    public final void adcel() {
        if (((Boolean) this.f26183e.getValue()).booleanValue()) {
            this.f26172e.setValue(Boolean.TRUE);
        } else {
            super.adcel();
        }
    }

    public final InterfaceC8346e applovin() {
        return (InterfaceC8346e) this.f26175e.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (defpackage.AbstractC7890e.billing((java.lang.String) r0.getValue(), r3 != null ? r3.subs : null) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (defpackage.AbstractC7890e.billing((java.lang.String) r0.getValue(), r3 != null ? r3.subs : null) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void isPro() {
        /*
            r4 = this;
            java.io.File r0 = r4.f26174e
            if (r0 != 0) goto L8d
            boolean r0 = r4.f26179e
            if (r0 != 0) goto L8d
            eؑۜٝ r0 = r4.f26178e
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            r2 = 0
            ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist r3 = r4.f26180e
            if (r1 <= 0) goto L2b
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r3 == 0) goto L24
            java.lang.String r1 = r3.subs
            goto L25
        L24:
            r1 = r2
        L25:
            boolean r0 = defpackage.AbstractC7890e.billing(r0, r1)
            if (r0 == 0) goto L8d
        L2b:
            eؑۜٝ r0 = r4.f26181e
            java.lang.Object r1 = r0.getValue()
            java.lang.String r1 = (java.lang.String) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L49
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r3 == 0) goto L43
            java.lang.String r2 = r3.subs
        L43:
            boolean r0 = defpackage.AbstractC7890e.billing(r0, r2)
            if (r0 == 0) goto L8d
        L49:
            if (r3 == 0) goto L5b
            eؑۜٝ r0 = r4.f26182e
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            boolean r1 = r3.f36514new
            if (r0 != r1) goto L8d
        L5b:
            if (r3 == 0) goto L8b
            eِۙؒ r0 = r4.f26176e
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L8b
            eؘؙ r0 = r0.f23934e
            if (r0 == 0) goto L70
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L70
            goto L8b
        L70:
            java.util.Iterator r0 = r0.iterator()
        L74:
            r1 = r0
            eٍۖۢ r1 = (defpackage.C9673e) r1
            boolean r1 = r1.hasNext()
            if (r1 == 0) goto L8b
            r1 = r0
            eٍۖۢ r1 = (defpackage.C9673e) r1
            java.lang.Object r1 = r1.next()
            eَؚۡ r1 = (defpackage.EnumC10584e) r1
            eَؚۡ r2 = defpackage.EnumC10584e.f20887e
            if (r1 == r2) goto L74
            goto L8d
        L8b:
            r0 = 0
            goto L8e
        L8d:
            r0 = 1
        L8e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            eؑۜٝ r1 = r4.f26183e
            r1.setValue(r0)
            java.lang.Object r0 = r1.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r4.pro(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C13182e.isPro():void");
    }

    @Override // defpackage.AbstractC16997e
    public final void tapsense(C13770e c13770e, int i) {
        int i2;
        InterfaceC5178e interfaceC5178e;
        boolean z;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(-1473785390);
        int i3 = i | (c13770e2.yandex(this) ? 4 : 2);
        if (c13770e2.m3673protected(i3 & 1, (i3 & 3) != 2)) {
            C4993e ad = AbstractC9735e.ad(0, 3, c13770e2);
            InterfaceC5178e interfaceC5178e2 = (InterfaceC5178e) c13770e2.adcel(AbstractC11473e.advert);
            C4094e c4094e = new C4094e(1);
            boolean yandex = c13770e2.yandex(this);
            Object m3681throw = c13770e2.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (yandex || m3681throw == c5170e) {
                m3681throw = new C11770e(this, 4);
                c13770e2.m3682throws(m3681throw);
            }
            C11192e yandex2 = AbstractC11538e.yandex(c4094e, (Function1) m3681throw, c13770e2);
            boolean yandex3 = c13770e2.yandex(this);
            Object m3681throw2 = c13770e2.m3681throw();
            if (yandex3 || m3681throw2 == c5170e) {
                m3681throw2 = new C2896e(this, (InterfaceC5083e) null);
                c13770e2.m3682throws(m3681throw2);
            }
            C10743e appmetrica = AbstractC7763e.appmetrica(ad, (Function4) m3681throw2, c13770e2);
            if (((Boolean) this.f26172e.getValue()).booleanValue()) {
                c13770e2.m3676strictfp(1912021260);
                boolean yandex4 = c13770e2.yandex(this);
                Object m3681throw3 = c13770e2.m3681throw();
                if (yandex4 || m3681throw3 == c5170e) {
                    m3681throw3 = new C15963e(this, 6);
                    c13770e2.m3682throws(m3681throw3);
                }
                interfaceC5178e = interfaceC5178e2;
                z = false;
                AbstractC9262e.ad((Function0) m3681throw3, AbstractC16653e.license(747019871, new C17518e(this, 0, (byte) 0), c13770e2), null, AbstractC16653e.license(-2144078239, new C17518e(this, 1, (byte) 0), c13770e2), null, AbstractC15390e.metrica, AbstractC15390e.license, null, 0L, 0L, 0L, 0L, 0.0f, null, c13770e, 1772592, 0, 16276);
                c13770e2 = c13770e;
            } else {
                interfaceC5178e = interfaceC5178e2;
                z = false;
                c13770e2.m3676strictfp(1902956240);
            }
            c13770e2.Signature(z);
            byte b = 0;
            i2 = i;
            AbstractC13348e.ad(null, AbstractC16653e.license(-2025449842, new C17518e(this, 2, b), c13770e2), AbstractC16653e.license(2137193709, new C17518e(this, 3, b), c13770e2), null, null, 0, 0L, 0L, AbstractC3338e.ad, AbstractC16653e.license(599965667, new C1701e(ad, yandex2, this, appmetrica, interfaceC5178e, 2), c13770e2), c13770e2, 905970096, 249);
        } else {
            i2 = i;
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C17518e(this, i2);
        }
    }
}
