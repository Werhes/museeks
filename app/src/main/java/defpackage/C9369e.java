package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioBook;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍَؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9369e implements Function1 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18629e;

    public /* synthetic */ C9369e(int i) {
        this.f18629e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18629e) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                return new C2493e(((Float) obj).floatValue());
            case 2:
                return new C2493e(((Integer) obj).intValue());
            case 3:
                return Integer.valueOf((int) ((C2493e) obj).ad);
            case 4:
                return new C2493e(((C15765e) obj).f31051e);
            case 5:
                return new C15765e(((C2493e) obj).ad);
            case 6:
                C8163e c8163e = (C8163e) obj;
                return new C14443e(C8163e.ad(c8163e.ad), C8163e.vip(c8163e.ad));
            case 7:
                C14443e c14443e = (C14443e) obj;
                return new C8163e((Float.floatToRawIntBits(c14443e.ad) << 32) | (Float.floatToRawIntBits(c14443e.vip) & 4294967295L));
            case 8:
                C2108e c2108e = (C2108e) obj;
                return new C14443e(Float.intBitsToFloat((int) (c2108e.ad >> 32)), Float.intBitsToFloat((int) (c2108e.ad & 4294967295L)));
            case 9:
                C14443e c14443e2 = (C14443e) obj;
                return new C2108e((Float.floatToRawIntBits(c14443e2.ad) << 32) | (Float.floatToRawIntBits(c14443e2.vip) & 4294967295L));
            case 10:
                C2152e c2152e = (C2152e) obj;
                return new C14443e(Float.intBitsToFloat((int) (c2152e.ad >> 32)), Float.intBitsToFloat((int) (c2152e.ad & 4294967295L)));
            case 11:
                C14443e c14443e3 = (C14443e) obj;
                return new C2152e((Float.floatToRawIntBits(c14443e3.ad) << 32) | (Float.floatToRawIntBits(c14443e3.vip) & 4294967295L));
            case 12:
                long j = ((C11490e) obj).ad;
                return new C14443e((int) (j >> 32), (int) (j & 4294967295L));
            case 13:
                C14443e c14443e4 = (C14443e) obj;
                return new C11490e((Math.round(c14443e4.ad) << 32) | (Math.round(c14443e4.vip) & 4294967295L));
            case 14:
                long j2 = ((C12729e) obj).ad;
                return new C14443e((int) (j2 >> 32), (int) (j2 & 4294967295L));
            case 15:
                C14443e c14443e5 = (C14443e) obj;
                int round = Math.round(c14443e5.ad);
                if (round < 0) {
                    round = 0;
                }
                return new C12729e(((Math.round(c14443e5.vip) >= 0 ? r7 : 0) & 4294967295L) | (round << 32));
            case 16:
                C0763e c0763e = (C0763e) obj;
                return new C8683e(c0763e.ad, c0763e.vip, c0763e.metrica, c0763e.license);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C8683e c8683e = (C8683e) obj;
                return new C0763e(c8683e.ad, c8683e.vip, c8683e.metrica, c8683e.license);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return Float.valueOf(((C2493e) obj).ad);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((AudioBook.Link) obj).vip;
            case 20:
                return ((MainArtist) obj).metrica;
            case 21:
                return ((MainArtist) obj).metrica;
            case 22:
                ((C6356e) obj).ad = true;
                return Unit.INSTANCE;
            case 23:
                AbstractC14145e.ad((C11093e) obj, AbstractC7763e.ad(new C9369e(25)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C3226e.ad((C3226e) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C15104e c15104e = (C15104e) obj;
                c15104e.ad = true;
                c15104e.metrica = true;
                c15104e.vip = true;
                c15104e.license = true;
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((C3566e) obj).m1375goto();
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((C3566e) obj).m1377this(EnumC10826e.f21457e);
                return Unit.INSTANCE;
            default:
                ((C3566e) obj).m1375goto();
                return Unit.INSTANCE;
        }
    }
}
