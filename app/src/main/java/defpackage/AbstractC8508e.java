package defpackage;

import android.net.Uri;
import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؗٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8508e {
    public static final C2892e ad = new C2892e(1205460965, false, new C9868e(2));

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        defpackage.InterfaceC13848e.ad.getClass();
        r7 = defpackage.C10772e.vip;
        r1 = (android.content.ContextWrapper) r0;
        r2 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        if (r2 < 34) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        r2 = defpackage.C12336e.f24727e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r7 = r2.mo2040final(r1, r7.vip);
        r1 = (r7.ad().width() << 32) | (r7.ad().height() & 4294967295L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        return new defpackage.C0931e(r1, defpackage.AbstractC4653e.metrica(defpackage.AbstractC8116e.startapp(r1), defpackage.AbstractC12315e.ad(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
    
        if (r2 < 30) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
    
        r2 = defpackage.C8123e.f16496e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
    
        r2 = defpackage.C6114e.f12851e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.C0931e ad(android.view.View r7) {
        /*
            android.content.Context r7 = r7.getContext()
            r0 = r7
        L5:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            r2 = 0
            if (r1 == 0) goto L21
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto Lf
            goto L28
        Lf:
            boolean r1 = r0 instanceof android.inputmethodservice.InputMethodService
            if (r1 == 0) goto L14
            goto L28
        L14:
            boolean r1 = r0 instanceof android.app.Application
            if (r1 == 0) goto L19
            goto L28
        L19:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r1 = r0.getBaseContext()
            if (r1 != 0) goto L23
        L21:
            r0 = r2
            goto L28
        L23:
            android.content.Context r0 = r0.getBaseContext()
            goto L5
        L28:
            if (r0 == 0) goto L7a
            eُُؔ r7 = defpackage.InterfaceC13848e.ad
            r7.getClass()
            eُؒٓ r7 = defpackage.C10772e.vip
            r1 = r0
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 34
            if (r2 < r3) goto L3d
            eؚّۙ r2 = defpackage.C12336e.f24727e
            goto L46
        L3d:
            r3 = 30
            if (r2 < r3) goto L44
            eًًۖ r2 = defpackage.C8123e.f16496e
            goto L46
        L44:
            eَؙؑ r2 = defpackage.C6114e.f12851e
        L46:
            eؚؖۧ r7 = r7.vip
            eٖٓۘ r7 = r2.mo2040final(r1, r7)
            android.graphics.Rect r1 = r7.ad()
            int r1 = r1.width()
            android.graphics.Rect r7 = r7.ad()
            int r7 = r7.height()
            long r1 = (long) r1
            r3 = 32
            long r1 = r1 << r3
            long r3 = (long) r7
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            long r1 = r1 | r3
            eّٓۤ r7 = defpackage.AbstractC12315e.ad(r0)
            long r3 = defpackage.AbstractC8116e.startapp(r1)
            long r3 = defpackage.AbstractC4653e.metrica(r3, r7)
            eًؒٗ r7 = new eًؒٗ
            r7.<init>(r1, r3)
            return r7
        L7a:
            android.content.res.Resources r0 = r7.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            eّٓۤ r7 = defpackage.AbstractC12315e.ad(r7)
            int r1 = r0.screenWidthDp
            float r1 = (float) r1
            int r0 = r0.screenHeightDp
            float r0 = (float) r0
            long r0 = defpackage.AbstractC11160e.ad(r1, r0)
            long r2 = defpackage.AbstractC4653e.appmetrica(r0, r7)
            long r2 = defpackage.AbstractC8116e.yandex(r2)
            eًؒٗ r7 = new eًؒٗ
            r7.<init>(r2, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8508e.ad(android.view.View):eًؒٗ");
    }

    public static int appmetrica(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static final void billing(C17466e c17466e, C12434e c12434e) {
        int i = c12434e.f24874e;
        int i2 = c12434e.f24873e;
        if (i >= i2 || !AbstractC15211e.license(c17466e.charAt(i))) {
            return;
        }
        do {
            i++;
            if (i >= i2) {
                break;
            }
        } while (AbstractC15211e.license(c17466e.charAt(i)));
        c12434e.f24874e = i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int license(String str) {
        char c;
        if (str == null) {
            return -1;
        }
        String amazon = AbstractC8542e.amazon(str);
        amazon.getClass();
        switch (amazon.hashCode()) {
            case -2123537834:
                if (amazon.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662384011:
                if (amazon.equals("video/mp2p")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1662384007:
                if (amazon.equals("video/mp2t")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1662095187:
                if (amazon.equals("video/webm")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1606874997:
                if (amazon.equals("audio/amr-wb")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1487656890:
                if (amazon.equals("image/avif")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1487464693:
                if (amazon.equals("image/heic")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1487464690:
                if (amazon.equals("image/heif")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1487394660:
                if (amazon.equals("image/jpeg")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1487018032:
                if (amazon.equals("image/webp")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1248337486:
                if (amazon.equals("application/mp4")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -1079884372:
                if (amazon.equals("video/x-msvideo")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -1004728940:
                if (amazon.equals("text/vtt")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -879272239:
                if (amazon.equals("image/bmp")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -879258763:
                if (amazon.equals("image/png")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -387023398:
                if (amazon.equals("audio/x-matroska")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -43467528:
                if (amazon.equals("application/webm")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 13915911:
                if (amazon.equals("video/x-flv")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (amazon.equals("audio/ac3")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (amazon.equals("audio/ac4")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 187078669:
                if (amazon.equals("audio/amr")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 187090232:
                if (amazon.equals("audio/mp4")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 187091926:
                if (amazon.equals("audio/ogg")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 187099443:
                if (amazon.equals("audio/wav")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 1331848029:
                if (amazon.equals("video/mp4")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            case 1503095341:
                if (amazon.equals("audio/3gpp")) {
                    c = 25;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (amazon.equals("audio/eac3")) {
                    c = 26;
                    break;
                }
                c = 65535;
                break;
            case 1504619009:
                if (amazon.equals("audio/flac")) {
                    c = 27;
                    break;
                }
                c = 65535;
                break;
            case 1504824762:
                if (amazon.equals("audio/midi")) {
                    c = 28;
                    break;
                }
                c = 65535;
                break;
            case 1504831518:
                if (amazon.equals("audio/mpeg")) {
                    c = 29;
                    break;
                }
                c = 65535;
                break;
            case 1505118770:
                if (amazon.equals("audio/webm")) {
                    c = 30;
                    break;
                }
                c = 65535;
                break;
            case 2039520277:
                if (amazon.equals("video/x-matroska")) {
                    c = 31;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case 15:
            case 16:
            case 30:
            case 31:
                return 6;
            case 4:
            case 20:
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return 3;
            case 5:
                return 21;
            case 6:
            case 7:
                return 20;
            case '\b':
                return 14;
            case '\t':
                return 18;
            case '\n':
            case 21:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return 8;
            case 11:
                return 16;
            case '\f':
                return 13;
            case '\r':
                return 19;
            case 14:
                return 17;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return 5;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return 1;
            case 22:
                return 9;
            case 23:
                return 12;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return 4;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return 15;
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return 7;
            default:
                return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (defpackage.AbstractC15211e.license(r2.charAt(r0)) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r0 >= r3) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (defpackage.AbstractC15211e.license(r2.charAt(r0)) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int metrica(defpackage.C17466e r2, defpackage.C12434e r3) {
        /*
            int r0 = r3.f24874e
            int r3 = r3.f24873e
            if (r0 >= r3) goto L1f
            char r1 = r2.charAt(r0)
            boolean r1 = defpackage.AbstractC15211e.license(r1)
            if (r1 == 0) goto L11
            goto L1f
        L11:
            int r0 = r0 + 1
            if (r0 >= r3) goto L1f
            char r1 = r2.charAt(r0)
            boolean r1 = defpackage.AbstractC15211e.license(r1)
            if (r1 == 0) goto L11
        L1f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC8508e.metrica(e٘ؐۧ, eًّّ):int");
    }

    public static final void purchase(InterfaceC3314e interfaceC3314e) {
        interfaceC3314e.setValue(Unit.INSTANCE);
    }

    public static InterfaceC3314e vip() {
        return new C0576e(Unit.INSTANCE, C10990e.f21771e);
    }
}
