package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؓٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16732e {
    public static final SparseIntArray appmetrica;
    public static final int[] license = {0, 4, 8};
    public static final SparseIntArray purchase;
    public final HashMap ad = new HashMap();
    public final boolean vip = true;
    public final HashMap metrica = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        appmetrica = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        purchase = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(EnergyProfile.EVCONNECTOR_TYPE_OTHER, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(EnergyProfile.EVCONNECTOR_TYPE_OTHER, 86);
        sparseIntArray2.append(94, 97);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void billing(java.lang.Object r7, android.content.res.TypedArray r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16732e.billing(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* JADX WARN: Type inference failed for: r6v189, types: [java.lang.Object, eْۙ٘] */
    public static C0584e license(Context context, AttributeSet attributeSet, boolean z) {
        int i;
        int i2;
        C0584e c0584e = new C0584e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? AbstractC15320e.metrica : AbstractC15320e.ad);
        C9909e c9909e = c0584e.vip;
        C13277e c13277e = c0584e.appmetrica;
        C9382e c9382e = c0584e.metrica;
        C13577e c13577e = c0584e.license;
        int[] iArr = license;
        String[] strArr = AbstractC15428e.ad;
        SparseIntArray sparseIntArray = appmetrica;
        if (z) {
            ?? obj = new Object();
            obj.ad = new int[10];
            obj.vip = new int[10];
            obj.metrica = 0;
            obj.license = new int[10];
            obj.appmetrica = new float[10];
            obj.purchase = 0;
            obj.billing = new int[5];
            obj.yandex = new String[5];
            obj.startapp = 0;
            obj.adcel = new int[4];
            obj.mopub = new boolean[4];
            obj.advert = 0;
            c9382e.getClass();
            c13577e.getClass();
            c13277e.getClass();
            int i3 = 0;
            for (int indexCount = obtainStyledAttributes.getIndexCount(); i3 < indexCount; indexCount = i2) {
                int index = obtainStyledAttributes.getIndex(i3);
                int i4 = i3;
                switch (purchase.get(index)) {
                    case 2:
                        i2 = indexCount;
                        obj.vip(2, obtainStyledAttributes.getDimensionPixelSize(index, c13577e.f26916this));
                        continue;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    case 30:
                    case 32:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    case Maneuver.TYPE_STRAIGHT /* 36 */:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb = new StringBuilder("Unknown attribute 0x");
                        i2 = indexCount;
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb.toString());
                        break;
                    case 5:
                        i2 = indexCount;
                        obj.metrica(5, obtainStyledAttributes.getString(index));
                        continue;
                    case 6:
                        i2 = indexCount;
                        obj.vip(6, obtainStyledAttributes.getDimensionPixelOffset(index, c13577e.subs));
                        break;
                    case 7:
                        i2 = indexCount;
                        obj.vip(7, obtainStyledAttributes.getDimensionPixelOffset(index, c13577e.crashlytics));
                        break;
                    case 8:
                        i2 = indexCount;
                        obj.vip(8, obtainStyledAttributes.getDimensionPixelSize(index, c13577e.f26905native));
                        break;
                    case 11:
                        i2 = indexCount;
                        obj.vip(11, obtainStyledAttributes.getDimensionPixelSize(index, c13577e.f26888break));
                        break;
                    case 12:
                        i2 = indexCount;
                        obj.vip(12, obtainStyledAttributes.getDimensionPixelSize(index, c13577e.f26887abstract));
                        break;
                    case 13:
                        i2 = indexCount;
                        obj.vip(13, obtainStyledAttributes.getDimensionPixelSize(index, c13577e.f26922while));
                        break;
                    case 14:
                        i2 = indexCount;
                        obj.vip(14, obtainStyledAttributes.getDimensionPixelSize(index, c13577e.f26909protected));
                        break;
                    case 15:
                        i2 = indexCount;
                        obj.vip(15, obtainStyledAttributes.getDimensionPixelSize(index, c13577e.f26894default));
                        break;
                    case 16:
                        i2 = indexCount;
                        obj.vip(16, obtainStyledAttributes.getDimensionPixelSize(index, c13577e.f26920try));
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        i2 = indexCount;
                        obj.vip(17, obtainStyledAttributes.getDimensionPixelOffset(index, c13577e.license));
                        break;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        i2 = indexCount;
                        obj.vip(18, obtainStyledAttributes.getDimensionPixelOffset(index, c13577e.appmetrica));
                        break;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        i2 = indexCount;
                        obj.ad(19, obtainStyledAttributes.getFloat(index, c13577e.purchase));
                        break;
                    case 20:
                        i2 = indexCount;
                        obj.ad(20, obtainStyledAttributes.getFloat(index, c13577e.isVip));
                        break;
                    case 21:
                        i2 = indexCount;
                        obj.vip(21, obtainStyledAttributes.getLayoutDimension(index, c13577e.metrica));
                        break;
                    case 22:
                        i2 = indexCount;
                        obj.vip(22, iArr[obtainStyledAttributes.getInt(index, c9909e.ad)]);
                        break;
                    case 23:
                        i2 = indexCount;
                        obj.vip(23, obtainStyledAttributes.getLayoutDimension(index, c13577e.vip));
                        break;
                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        i2 = indexCount;
                        obj.vip(24, obtainStyledAttributes.getDimensionPixelSize(index, c13577e.f26891class));
                        break;
                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                        i2 = indexCount;
                        obj.vip(27, obtainStyledAttributes.getInt(index, c13577e.firebase));
                        break;
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        i2 = indexCount;
                        obj.vip(28, obtainStyledAttributes.getDimensionPixelSize(index, c13577e.f26904interface));
                        break;
                    case 31:
                        i2 = indexCount;
                        obj.vip(31, obtainStyledAttributes.getDimensionPixelSize(index, c13577e.f26896extends));
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        i2 = indexCount;
                        obj.vip(34, obtainStyledAttributes.getDimensionPixelSize(index, c13577e.f26900goto));
                        break;
                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                        i2 = indexCount;
                        obj.ad(37, obtainStyledAttributes.getFloat(index, c13577e.inmobi));
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                        i2 = indexCount;
                        int resourceId = obtainStyledAttributes.getResourceId(index, c0584e.ad);
                        c0584e.ad = resourceId;
                        obj.vip(38, resourceId);
                        break;
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                        i2 = indexCount;
                        obj.ad(39, obtainStyledAttributes.getFloat(index, c13577e.f26890catch));
                        break;
                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                        i2 = indexCount;
                        obj.ad(40, obtainStyledAttributes.getFloat(index, c13577e.f26889case));
                        break;
                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                        i2 = indexCount;
                        obj.vip(41, obtainStyledAttributes.getInt(index, c13577e.f26897final));
                        break;
                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                        i2 = indexCount;
                        obj.vip(42, obtainStyledAttributes.getInt(index, c13577e.f26913super));
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                        i2 = indexCount;
                        obj.ad(43, obtainStyledAttributes.getFloat(index, c9909e.metrica));
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                        i2 = indexCount;
                        obj.license(44, true);
                        obj.ad(44, obtainStyledAttributes.getDimension(index, c13277e.smaato));
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                        i2 = indexCount;
                        obj.ad(45, obtainStyledAttributes.getFloat(index, c13277e.vip));
                        break;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                        i2 = indexCount;
                        obj.ad(46, obtainStyledAttributes.getFloat(index, c13277e.metrica));
                        break;
                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                        i2 = indexCount;
                        obj.ad(47, obtainStyledAttributes.getFloat(index, c13277e.license));
                        break;
                    case 48:
                        i2 = indexCount;
                        obj.ad(48, obtainStyledAttributes.getFloat(index, c13277e.appmetrica));
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        i2 = indexCount;
                        obj.ad(49, obtainStyledAttributes.getDimension(index, c13277e.purchase));
                        break;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        i2 = indexCount;
                        obj.ad(50, obtainStyledAttributes.getDimension(index, c13277e.billing));
                        break;
                    case 51:
                        i2 = indexCount;
                        obj.ad(51, obtainStyledAttributes.getDimension(index, c13277e.startapp));
                        break;
                    case 52:
                        i2 = indexCount;
                        obj.ad(52, obtainStyledAttributes.getDimension(index, c13277e.adcel));
                        break;
                    case 53:
                        i2 = indexCount;
                        obj.ad(53, obtainStyledAttributes.getDimension(index, c13277e.mopub));
                        break;
                    case 54:
                        i2 = indexCount;
                        obj.vip(54, obtainStyledAttributes.getInt(index, c13577e.f26906new));
                        break;
                    case 55:
                        i2 = indexCount;
                        obj.vip(55, obtainStyledAttributes.getInt(index, c13577e.f26912strictfp));
                        break;
                    case 56:
                        i2 = indexCount;
                        obj.vip(56, obtainStyledAttributes.getDimensionPixelSize(index, c13577e.f26908private));
                        break;
                    case 57:
                        i2 = indexCount;
                        obj.vip(57, obtainStyledAttributes.getDimensionPixelSize(index, c13577e.f26907package));
                        break;
                    case 58:
                        i2 = indexCount;
                        obj.vip(58, obtainStyledAttributes.getDimensionPixelSize(index, c13577e.f26919transient));
                        break;
                    case 59:
                        i2 = indexCount;
                        obj.vip(59, obtainStyledAttributes.getDimensionPixelSize(index, c13577e.f26902import));
                        break;
                    case 60:
                        i2 = indexCount;
                        obj.ad(60, obtainStyledAttributes.getFloat(index, c13277e.ad));
                        break;
                    case 62:
                        i2 = indexCount;
                        obj.vip(62, obtainStyledAttributes.getDimensionPixelSize(index, c13577e.ads));
                        break;
                    case 63:
                        i2 = indexCount;
                        obj.ad(63, obtainStyledAttributes.getFloat(index, c13577e.premium));
                        break;
                    case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                        i2 = indexCount;
                        obj.vip(64, purchase(obtainStyledAttributes, index, c9382e.ad));
                        break;
                    case 65:
                        i2 = indexCount;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obj.metrica(65, obtainStyledAttributes.getString(index));
                            break;
                        } else {
                            obj.metrica(65, strArr[obtainStyledAttributes.getInteger(index, 0)]);
                            break;
                        }
                    case 66:
                        i2 = indexCount;
                        obj.vip(66, obtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i2 = indexCount;
                        obj.ad(67, obtainStyledAttributes.getFloat(index, c9382e.appmetrica));
                        break;
                    case 68:
                        i2 = indexCount;
                        obj.ad(68, obtainStyledAttributes.getFloat(index, c9909e.license));
                        break;
                    case 69:
                        i2 = indexCount;
                        obj.ad(69, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 70:
                        i2 = indexCount;
                        obj.ad(70, obtainStyledAttributes.getFloat(index, 1.0f));
                        break;
                    case 71:
                        i2 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i2 = indexCount;
                        obj.vip(72, obtainStyledAttributes.getInt(index, c13577e.f26915synchronized));
                        break;
                    case 73:
                        i2 = indexCount;
                        obj.vip(73, obtainStyledAttributes.getDimensionPixelSize(index, c13577e.f26910return));
                        break;
                    case 74:
                        i2 = indexCount;
                        obj.metrica(74, obtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i2 = indexCount;
                        obj.license(75, obtainStyledAttributes.getBoolean(index, c13577e.f26899for));
                        break;
                    case 76:
                        i2 = indexCount;
                        obj.vip(76, obtainStyledAttributes.getInt(index, c9382e.metrica));
                        break;
                    case 77:
                        i2 = indexCount;
                        obj.metrica(77, obtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i2 = indexCount;
                        obj.vip(78, obtainStyledAttributes.getInt(index, c9909e.vip));
                        break;
                    case 79:
                        i2 = indexCount;
                        obj.ad(79, obtainStyledAttributes.getFloat(index, c9382e.license));
                        break;
                    case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                        i2 = indexCount;
                        obj.license(80, obtainStyledAttributes.getBoolean(index, c13577e.f26892const));
                        break;
                    case 81:
                        i2 = indexCount;
                        obj.license(81, obtainStyledAttributes.getBoolean(index, c13577e.f26921volatile));
                        break;
                    case 82:
                        i2 = indexCount;
                        obj.vip(82, obtainStyledAttributes.getInteger(index, c9382e.vip));
                        break;
                    case 83:
                        i2 = indexCount;
                        obj.vip(83, purchase(obtainStyledAttributes, index, c13277e.yandex));
                        break;
                    case 84:
                        i2 = indexCount;
                        obj.vip(84, obtainStyledAttributes.getInteger(index, c9382e.billing));
                        break;
                    case 85:
                        i2 = indexCount;
                        obj.ad(85, obtainStyledAttributes.getFloat(index, c9382e.purchase));
                        break;
                    case 86:
                        i2 = indexCount;
                        int i5 = obtainStyledAttributes.peekValue(index).type;
                        if (i5 == 1) {
                            int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                            c9382e.startapp = resourceId2;
                            obj.vip(89, resourceId2);
                            if (c9382e.startapp != -1) {
                                obj.vip(88, -2);
                                break;
                            }
                        } else if (i5 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            c9382e.yandex = string;
                            obj.metrica(90, string);
                            if (c9382e.yandex.indexOf("/") > 0) {
                                int resourceId3 = obtainStyledAttributes.getResourceId(index, -1);
                                c9382e.startapp = resourceId3;
                                obj.vip(89, resourceId3);
                                obj.vip(88, -2);
                                break;
                            } else {
                                obj.vip(88, -1);
                                break;
                            }
                        } else {
                            obj.vip(88, obtainStyledAttributes.getInteger(index, c9382e.startapp));
                            break;
                        }
                        break;
                    case 87:
                        i2 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i2 = indexCount;
                        obj.vip(93, obtainStyledAttributes.getDimensionPixelSize(index, c13577e.f26917throw));
                        break;
                    case 94:
                        i2 = indexCount;
                        obj.vip(94, obtainStyledAttributes.getDimensionPixelSize(index, c13577e.f26901implements));
                        break;
                    case 95:
                        i2 = indexCount;
                        billing(obj, obtainStyledAttributes, index, 0);
                        break;
                    case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                        i2 = indexCount;
                        billing(obj, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i2 = indexCount;
                        obj.vip(97, obtainStyledAttributes.getInt(index, c13577e.f26893continue));
                        break;
                    case 98:
                        i2 = indexCount;
                        int i6 = AbstractC11663e.f23434e;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            c0584e.ad = obtainStyledAttributes.getResourceId(index, c0584e.ad);
                            break;
                        }
                    case 99:
                        i2 = indexCount;
                        obj.license(99, obtainStyledAttributes.getBoolean(index, c13577e.billing));
                        break;
                }
                i3 = i4 + 1;
            }
        } else {
            int i7 = 0;
            for (int indexCount2 = obtainStyledAttributes.getIndexCount(); i7 < indexCount2; indexCount2 = i) {
                int index2 = obtainStyledAttributes.getIndex(i7);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        c9382e.getClass();
                        c13577e.getClass();
                        c13277e.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i = indexCount2;
                        c13577e.Signature = purchase(obtainStyledAttributes, index2, c13577e.Signature);
                        continue;
                    case 2:
                        i = indexCount2;
                        c13577e.f26916this = obtainStyledAttributes.getDimensionPixelSize(index2, c13577e.f26916this);
                        continue;
                    case 3:
                        i = indexCount2;
                        c13577e.loadAd = purchase(obtainStyledAttributes, index2, c13577e.loadAd);
                        continue;
                    case 4:
                        i = indexCount2;
                        c13577e.amazon = purchase(obtainStyledAttributes, index2, c13577e.amazon);
                        continue;
                    case 5:
                        i = indexCount2;
                        c13577e.isPro = obtainStyledAttributes.getString(index2);
                        continue;
                    case 6:
                        i = indexCount2;
                        c13577e.subs = obtainStyledAttributes.getDimensionPixelOffset(index2, c13577e.subs);
                        continue;
                    case 7:
                        i = indexCount2;
                        c13577e.crashlytics = obtainStyledAttributes.getDimensionPixelOffset(index2, c13577e.crashlytics);
                        continue;
                    case 8:
                        i = indexCount2;
                        c13577e.f26905native = obtainStyledAttributes.getDimensionPixelSize(index2, c13577e.f26905native);
                        continue;
                    case 9:
                        i = indexCount2;
                        c13577e.tapsense = purchase(obtainStyledAttributes, index2, c13577e.tapsense);
                        continue;
                    case 10:
                        i = indexCount2;
                        c13577e.signatures = purchase(obtainStyledAttributes, index2, c13577e.signatures);
                        continue;
                    case 11:
                        i = indexCount2;
                        c13577e.f26888break = obtainStyledAttributes.getDimensionPixelSize(index2, c13577e.f26888break);
                        continue;
                    case 12:
                        i = indexCount2;
                        c13577e.f26887abstract = obtainStyledAttributes.getDimensionPixelSize(index2, c13577e.f26887abstract);
                        continue;
                    case 13:
                        i = indexCount2;
                        c13577e.f26922while = obtainStyledAttributes.getDimensionPixelSize(index2, c13577e.f26922while);
                        continue;
                    case 14:
                        i = indexCount2;
                        c13577e.f26909protected = obtainStyledAttributes.getDimensionPixelSize(index2, c13577e.f26909protected);
                        continue;
                    case 15:
                        i = indexCount2;
                        c13577e.f26894default = obtainStyledAttributes.getDimensionPixelSize(index2, c13577e.f26894default);
                        continue;
                    case 16:
                        i = indexCount2;
                        c13577e.f26920try = obtainStyledAttributes.getDimensionPixelSize(index2, c13577e.f26920try);
                        continue;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        i = indexCount2;
                        c13577e.license = obtainStyledAttributes.getDimensionPixelOffset(index2, c13577e.license);
                        continue;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        i = indexCount2;
                        c13577e.appmetrica = obtainStyledAttributes.getDimensionPixelOffset(index2, c13577e.appmetrica);
                        continue;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        i = indexCount2;
                        c13577e.purchase = obtainStyledAttributes.getFloat(index2, c13577e.purchase);
                        continue;
                    case 20:
                        i = indexCount2;
                        c13577e.isVip = obtainStyledAttributes.getFloat(index2, c13577e.isVip);
                        continue;
                    case 21:
                        i = indexCount2;
                        c13577e.metrica = obtainStyledAttributes.getLayoutDimension(index2, c13577e.metrica);
                        continue;
                    case 22:
                        i = indexCount2;
                        int i8 = obtainStyledAttributes.getInt(index2, c9909e.ad);
                        c9909e.ad = i8;
                        c9909e.ad = iArr[i8];
                        continue;
                    case 23:
                        i = indexCount2;
                        c13577e.vip = obtainStyledAttributes.getLayoutDimension(index2, c13577e.vip);
                        continue;
                    case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                        i = indexCount2;
                        c13577e.f26891class = obtainStyledAttributes.getDimensionPixelSize(index2, c13577e.f26891class);
                        continue;
                    case Maneuver.TYPE_FORK_LEFT /* 25 */:
                        i = indexCount2;
                        c13577e.yandex = purchase(obtainStyledAttributes, index2, c13577e.yandex);
                        continue;
                    case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                        i = indexCount2;
                        c13577e.startapp = purchase(obtainStyledAttributes, index2, c13577e.startapp);
                        continue;
                    case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                        i = indexCount2;
                        c13577e.firebase = obtainStyledAttributes.getInt(index2, c13577e.firebase);
                        continue;
                    case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                        i = indexCount2;
                        c13577e.f26904interface = obtainStyledAttributes.getDimensionPixelSize(index2, c13577e.f26904interface);
                        continue;
                    case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                        i = indexCount2;
                        c13577e.adcel = purchase(obtainStyledAttributes, index2, c13577e.adcel);
                        continue;
                    case 30:
                        i = indexCount2;
                        c13577e.mopub = purchase(obtainStyledAttributes, index2, c13577e.mopub);
                        continue;
                    case 31:
                        i = indexCount2;
                        c13577e.f26896extends = obtainStyledAttributes.getDimensionPixelSize(index2, c13577e.f26896extends);
                        continue;
                    case 32:
                        i = indexCount2;
                        c13577e.remoteconfig = purchase(obtainStyledAttributes, index2, c13577e.remoteconfig);
                        continue;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                        i = indexCount2;
                        c13577e.pro = purchase(obtainStyledAttributes, index2, c13577e.pro);
                        continue;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                        i = indexCount2;
                        c13577e.f26900goto = obtainStyledAttributes.getDimensionPixelSize(index2, c13577e.f26900goto);
                        continue;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                        i = indexCount2;
                        c13577e.smaato = purchase(obtainStyledAttributes, index2, c13577e.smaato);
                        continue;
                    case Maneuver.TYPE_STRAIGHT /* 36 */:
                        i = indexCount2;
                        c13577e.advert = purchase(obtainStyledAttributes, index2, c13577e.advert);
                        continue;
                    case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                        i = indexCount2;
                        c13577e.inmobi = obtainStyledAttributes.getFloat(index2, c13577e.inmobi);
                        continue;
                    case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                        i = indexCount2;
                        c0584e.ad = obtainStyledAttributes.getResourceId(index2, c0584e.ad);
                        continue;
                    case Maneuver.TYPE_DESTINATION /* 39 */:
                        i = indexCount2;
                        c13577e.f26890catch = obtainStyledAttributes.getFloat(index2, c13577e.f26890catch);
                        continue;
                    case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                        i = indexCount2;
                        c13577e.f26889case = obtainStyledAttributes.getFloat(index2, c13577e.f26889case);
                        continue;
                    case Maneuver.TYPE_DESTINATION_LEFT /* 41 */:
                        i = indexCount2;
                        c13577e.f26897final = obtainStyledAttributes.getInt(index2, c13577e.f26897final);
                        continue;
                    case Maneuver.TYPE_DESTINATION_RIGHT /* 42 */:
                        i = indexCount2;
                        c13577e.f26913super = obtainStyledAttributes.getInt(index2, c13577e.f26913super);
                        continue;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CW /* 43 */:
                        i = indexCount2;
                        c9909e.metrica = obtainStyledAttributes.getFloat(index2, c9909e.metrica);
                        continue;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CW /* 44 */:
                        i = indexCount2;
                        c13277e.advert = true;
                        c13277e.smaato = obtainStyledAttributes.getDimension(index2, c13277e.smaato);
                        continue;
                    case Maneuver.TYPE_ROUNDABOUT_ENTER_CCW /* 45 */:
                        i = indexCount2;
                        c13277e.vip = obtainStyledAttributes.getFloat(index2, c13277e.vip);
                        continue;
                    case Maneuver.TYPE_ROUNDABOUT_EXIT_CCW /* 46 */:
                        i = indexCount2;
                        c13277e.metrica = obtainStyledAttributes.getFloat(index2, c13277e.metrica);
                        continue;
                    case Maneuver.TYPE_FERRY_BOAT_LEFT /* 47 */:
                        i = indexCount2;
                        c13277e.license = obtainStyledAttributes.getFloat(index2, c13277e.license);
                        continue;
                    case 48:
                        i = indexCount2;
                        c13277e.appmetrica = obtainStyledAttributes.getFloat(index2, c13277e.appmetrica);
                        continue;
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                        i = indexCount2;
                        c13277e.purchase = obtainStyledAttributes.getDimension(index2, c13277e.purchase);
                        continue;
                    case Maneuver.TYPE_FERRY_TRAIN_RIGHT /* 50 */:
                        i = indexCount2;
                        c13277e.billing = obtainStyledAttributes.getDimension(index2, c13277e.billing);
                        continue;
                    case 51:
                        i = indexCount2;
                        c13277e.startapp = obtainStyledAttributes.getDimension(index2, c13277e.startapp);
                        continue;
                    case 52:
                        i = indexCount2;
                        c13277e.adcel = obtainStyledAttributes.getDimension(index2, c13277e.adcel);
                        continue;
                    case 53:
                        i = indexCount2;
                        c13277e.mopub = obtainStyledAttributes.getDimension(index2, c13277e.mopub);
                        continue;
                    case 54:
                        i = indexCount2;
                        c13577e.f26906new = obtainStyledAttributes.getInt(index2, c13577e.f26906new);
                        continue;
                    case 55:
                        i = indexCount2;
                        c13577e.f26912strictfp = obtainStyledAttributes.getInt(index2, c13577e.f26912strictfp);
                        continue;
                    case 56:
                        i = indexCount2;
                        c13577e.f26908private = obtainStyledAttributes.getDimensionPixelSize(index2, c13577e.f26908private);
                        continue;
                    case 57:
                        i = indexCount2;
                        c13577e.f26907package = obtainStyledAttributes.getDimensionPixelSize(index2, c13577e.f26907package);
                        continue;
                    case 58:
                        i = indexCount2;
                        c13577e.f26919transient = obtainStyledAttributes.getDimensionPixelSize(index2, c13577e.f26919transient);
                        continue;
                    case 59:
                        i = indexCount2;
                        c13577e.f26902import = obtainStyledAttributes.getDimensionPixelSize(index2, c13577e.f26902import);
                        continue;
                    case 60:
                        i = indexCount2;
                        c13277e.ad = obtainStyledAttributes.getFloat(index2, c13277e.ad);
                        continue;
                    case 61:
                        i = indexCount2;
                        c13577e.applovin = purchase(obtainStyledAttributes, index2, c13577e.applovin);
                        continue;
                    case 62:
                        i = indexCount2;
                        c13577e.ads = obtainStyledAttributes.getDimensionPixelSize(index2, c13577e.ads);
                        continue;
                    case 63:
                        i = indexCount2;
                        c13577e.premium = obtainStyledAttributes.getFloat(index2, c13577e.premium);
                        continue;
                    case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                        i = indexCount2;
                        c9382e.ad = purchase(obtainStyledAttributes, index2, c9382e.ad);
                        continue;
                    case 65:
                        i = indexCount2;
                        if (obtainStyledAttributes.peekValue(index2).type == 3) {
                            obtainStyledAttributes.getString(index2);
                            c9382e.getClass();
                            break;
                        } else {
                            String str = strArr[obtainStyledAttributes.getInteger(index2, 0)];
                            c9382e.getClass();
                            break;
                        }
                    case 66:
                        i = indexCount2;
                        obtainStyledAttributes.getInt(index2, 0);
                        c9382e.getClass();
                        continue;
                    case 67:
                        i = indexCount2;
                        c9382e.appmetrica = obtainStyledAttributes.getFloat(index2, c9382e.appmetrica);
                        break;
                    case 68:
                        i = indexCount2;
                        c9909e.license = obtainStyledAttributes.getFloat(index2, c9909e.license);
                        break;
                    case 69:
                        i = indexCount2;
                        c13577e.f26903instanceof = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i = indexCount2;
                        c13577e.f26911static = obtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i = indexCount2;
                        c13577e.f26915synchronized = obtainStyledAttributes.getInt(index2, c13577e.f26915synchronized);
                        break;
                    case 73:
                        i = indexCount2;
                        c13577e.f26910return = obtainStyledAttributes.getDimensionPixelSize(index2, c13577e.f26910return);
                        break;
                    case 74:
                        i = indexCount2;
                        c13577e.f26918throws = obtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i = indexCount2;
                        c13577e.f26899for = obtainStyledAttributes.getBoolean(index2, c13577e.f26899for);
                        break;
                    case 76:
                        i = indexCount2;
                        c9382e.metrica = obtainStyledAttributes.getInt(index2, c9382e.metrica);
                        break;
                    case 77:
                        i = indexCount2;
                        c13577e.f26898finally = obtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i = indexCount2;
                        c9909e.vip = obtainStyledAttributes.getInt(index2, c9909e.vip);
                        break;
                    case 79:
                        i = indexCount2;
                        c9382e.license = obtainStyledAttributes.getFloat(index2, c9382e.license);
                        break;
                    case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                        i = indexCount2;
                        c13577e.f26892const = obtainStyledAttributes.getBoolean(index2, c13577e.f26892const);
                        break;
                    case 81:
                        i = indexCount2;
                        c13577e.f26921volatile = obtainStyledAttributes.getBoolean(index2, c13577e.f26921volatile);
                        break;
                    case 82:
                        i = indexCount2;
                        c9382e.vip = obtainStyledAttributes.getInteger(index2, c9382e.vip);
                        break;
                    case 83:
                        i = indexCount2;
                        c13277e.yandex = purchase(obtainStyledAttributes, index2, c13277e.yandex);
                        break;
                    case 84:
                        i = indexCount2;
                        c9382e.billing = obtainStyledAttributes.getInteger(index2, c9382e.billing);
                        break;
                    case 85:
                        i = indexCount2;
                        c9382e.purchase = obtainStyledAttributes.getFloat(index2, c9382e.purchase);
                        break;
                    case 86:
                        i = indexCount2;
                        int i9 = obtainStyledAttributes.peekValue(index2).type;
                        if (i9 == 1) {
                            c9382e.startapp = obtainStyledAttributes.getResourceId(index2, -1);
                            break;
                        } else if (i9 == 3) {
                            String string2 = obtainStyledAttributes.getString(index2);
                            c9382e.yandex = string2;
                            if (string2.indexOf("/") > 0) {
                                c9382e.startapp = obtainStyledAttributes.getResourceId(index2, -1);
                                break;
                            }
                        } else {
                            obtainStyledAttributes.getInteger(index2, c9382e.startapp);
                            break;
                        }
                        break;
                    case 87:
                        i = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i = indexCount2;
                        sb2.append(Integer.toHexString(index2));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 91:
                        i = indexCount2;
                        c13577e.admob = purchase(obtainStyledAttributes, index2, c13577e.admob);
                        break;
                    case 92:
                        i = indexCount2;
                        c13577e.subscription = purchase(obtainStyledAttributes, index2, c13577e.subscription);
                        break;
                    case 93:
                        i = indexCount2;
                        c13577e.f26917throw = obtainStyledAttributes.getDimensionPixelSize(index2, c13577e.f26917throw);
                        break;
                    case 94:
                        i = indexCount2;
                        c13577e.f26901implements = obtainStyledAttributes.getDimensionPixelSize(index2, c13577e.f26901implements);
                        break;
                    case 95:
                        i = indexCount2;
                        billing(c13577e, obtainStyledAttributes, index2, 0);
                        continue;
                    case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                        i = indexCount2;
                        billing(c13577e, obtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i = indexCount2;
                        c13577e.f26893continue = obtainStyledAttributes.getInt(index2, c13577e.f26893continue);
                        break;
                }
                i7++;
            }
            if (c13577e.f26918throws != null) {
                c13577e.f26914switch = null;
            }
        }
        obtainStyledAttributes.recycle();
        return c0584e;
    }

    public static int[] metrica(C17479e c17479e, String str) {
        int i;
        String[] split = str.split(",");
        Context context = c17479e.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = AbstractC7515e.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && c17479e.isInEditMode() && (c17479e.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) c17479e.getParent();
                if (AbstractC0869e.premium(trim)) {
                    HashMap hashMap = constraintLayout.f350e;
                    if (hashMap != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.f350e.get(trim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    i = ((Integer) obj).intValue();
                }
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    public static int purchase(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    public static void yandex(C3579e c3579e, String str) {
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i = -1;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = str.substring(0, indexOf);
                i = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : -1;
                r2 = indexOf + 1;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(r2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(r2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c3579e.f8084interface = str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x010f. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.view.View, e٘ؑۖ, eّٟؑ] */
    /* JADX WARN: Type inference failed for: r8v2, types: [eٓۚؓ, eُؙٕ] */
    public final void ad(ConstraintLayout constraintLayout) {
        int i;
        HashSet hashSet;
        int i2;
        HashMap hashMap;
        String str;
        C16732e c16732e = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = c16732e.metrica;
        HashSet hashSet2 = new HashSet(hashMap2.keySet());
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            int id = childAt.getId();
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder("id unknown ");
                try {
                    str = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    str = "UNKNOWN";
                }
                sb.append(str);
                Log.w("ConstraintSet", sb.toString());
            } else {
                if (c16732e.vip && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (hashMap2.containsKey(Integer.valueOf(id))) {
                        hashSet2.remove(Integer.valueOf(id));
                        C0584e c0584e = (C0584e) hashMap2.get(Integer.valueOf(id));
                        if (c0584e != null) {
                            C9909e c9909e = c0584e.vip;
                            C13577e c13577e = c0584e.license;
                            C13277e c13277e = c0584e.appmetrica;
                            if (childAt instanceof C17479e) {
                                c13577e.f26895else = 1;
                                C17479e c17479e = (C17479e) childAt;
                                c17479e.setId(id);
                                c17479e.setType(c13577e.f26915synchronized);
                                c17479e.setMargin(c13577e.f26910return);
                                c17479e.setAllowsGoneWidget(c13577e.f26899for);
                                int[] iArr = c13577e.f26914switch;
                                if (iArr != null) {
                                    c17479e.setReferencedIds(iArr);
                                } else {
                                    String str2 = c13577e.f26918throws;
                                    if (str2 != null) {
                                        int[] metrica = metrica(c17479e, str2);
                                        c13577e.f26914switch = metrica;
                                        c17479e.setReferencedIds(metrica);
                                    }
                                }
                            }
                            C3579e c3579e = (C3579e) childAt.getLayoutParams();
                            c3579e.ad();
                            c0584e.ad(c3579e);
                            HashMap hashMap3 = c0584e.purchase;
                            Class<?> cls = childAt.getClass();
                            for (String str3 : hashMap3.keySet()) {
                                C0377e c0377e = (C0377e) hashMap3.get(str3);
                                HashSet hashSet3 = hashSet2;
                                String Signature = !c0377e.ad ? AbstractC17861e.Signature("set", str3) : str3;
                                int i4 = i3;
                                try {
                                    int m2467class = AbstractC8703e.m2467class(c0377e.vip);
                                    Class<?> cls2 = Float.TYPE;
                                    Class<?> cls3 = Integer.TYPE;
                                    switch (m2467class) {
                                        case 0:
                                            hashMap = hashMap3;
                                            cls.getMethod(Signature, cls3).invoke(childAt, Integer.valueOf(c0377e.metrica));
                                            break;
                                        case 1:
                                            hashMap = hashMap3;
                                            cls.getMethod(Signature, cls2).invoke(childAt, Float.valueOf(c0377e.license));
                                            break;
                                        case 2:
                                            hashMap = hashMap3;
                                            cls.getMethod(Signature, cls3).invoke(childAt, Integer.valueOf(c0377e.billing));
                                            break;
                                        case 3:
                                            hashMap = hashMap3;
                                            Method method = cls.getMethod(Signature, Drawable.class);
                                            ColorDrawable colorDrawable = new ColorDrawable();
                                            colorDrawable.setColor(c0377e.billing);
                                            method.invoke(childAt, colorDrawable);
                                            break;
                                        case 4:
                                            hashMap = hashMap3;
                                            cls.getMethod(Signature, CharSequence.class).invoke(childAt, c0377e.appmetrica);
                                            break;
                                        case 5:
                                            hashMap = hashMap3;
                                            cls.getMethod(Signature, Boolean.TYPE).invoke(childAt, Boolean.valueOf(c0377e.purchase));
                                            break;
                                        case 6:
                                            hashMap = hashMap3;
                                            cls.getMethod(Signature, cls2).invoke(childAt, Float.valueOf(c0377e.license));
                                            break;
                                        case 7:
                                            hashMap = hashMap3;
                                            try {
                                                cls.getMethod(Signature, cls3).invoke(childAt, Integer.valueOf(c0377e.metrica));
                                            } catch (IllegalAccessException e) {
                                                e = e;
                                                StringBuilder applovin = AbstractC8703e.applovin(" Custom Attribute \"", str3, "\" not found on ");
                                                applovin.append(cls.getName());
                                                Log.e("TransitionLayout", applovin.toString(), e);
                                                hashSet2 = hashSet3;
                                                i3 = i4;
                                                hashMap3 = hashMap;
                                            } catch (NoSuchMethodException e2) {
                                                e = e2;
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + Signature, e);
                                                hashSet2 = hashSet3;
                                                i3 = i4;
                                                hashMap3 = hashMap;
                                            } catch (InvocationTargetException e3) {
                                                e = e3;
                                                StringBuilder applovin2 = AbstractC8703e.applovin(" Custom Attribute \"", str3, "\" not found on ");
                                                applovin2.append(cls.getName());
                                                Log.e("TransitionLayout", applovin2.toString(), e);
                                                hashSet2 = hashSet3;
                                                i3 = i4;
                                                hashMap3 = hashMap;
                                            }
                                        default:
                                            hashMap = hashMap3;
                                            break;
                                    }
                                } catch (IllegalAccessException e4) {
                                    e = e4;
                                    hashMap = hashMap3;
                                } catch (NoSuchMethodException e5) {
                                    e = e5;
                                    hashMap = hashMap3;
                                } catch (InvocationTargetException e6) {
                                    e = e6;
                                    hashMap = hashMap3;
                                }
                                hashSet2 = hashSet3;
                                i3 = i4;
                                hashMap3 = hashMap;
                            }
                            hashSet = hashSet2;
                            i2 = i3;
                            childAt.setLayoutParams(c3579e);
                            if (c9909e.vip == 0) {
                                childAt.setVisibility(c9909e.ad);
                            }
                            childAt.setAlpha(c9909e.metrica);
                            childAt.setRotation(c13277e.ad);
                            childAt.setRotationX(c13277e.vip);
                            childAt.setRotationY(c13277e.metrica);
                            childAt.setScaleX(c13277e.license);
                            childAt.setScaleY(c13277e.appmetrica);
                            if (c13277e.yandex != -1) {
                                if (((View) childAt.getParent()).findViewById(c13277e.yandex) != null) {
                                    float bottom = (r0.getBottom() + r0.getTop()) / 2.0f;
                                    float right = (r0.getRight() + r0.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(right - childAt.getLeft());
                                        childAt.setPivotY(bottom - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(c13277e.purchase)) {
                                    childAt.setPivotX(c13277e.purchase);
                                }
                                if (!Float.isNaN(c13277e.billing)) {
                                    childAt.setPivotY(c13277e.billing);
                                }
                            }
                            childAt.setTranslationX(c13277e.startapp);
                            childAt.setTranslationY(c13277e.adcel);
                            childAt.setTranslationZ(c13277e.mopub);
                            if (c13277e.advert) {
                                childAt.setElevation(c13277e.smaato);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i2 = i3;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                    i3 = i2 + 1;
                    c16732e = this;
                    hashSet2 = hashSet;
                }
            }
            hashSet = hashSet2;
            i2 = i3;
            i3 = i2 + 1;
            c16732e = this;
            hashSet2 = hashSet;
        }
        int i5 = 0;
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0584e c0584e2 = (C0584e) hashMap2.get(num);
            if (c0584e2 != null) {
                C13577e c13577e2 = c0584e2.license;
                if (c13577e2.f26895else == 1) {
                    Context context = constraintLayout.getContext();
                    ?? view = new View(context);
                    view.f2263e = new int[32];
                    view.f2264e = new HashMap();
                    view.f2260e = context;
                    ?? abstractC14215e = new AbstractC14215e();
                    boolean z = i5;
                    abstractC14215e.f30320e = z ? 1 : 0;
                    abstractC14215e.f30318e = true;
                    abstractC14215e.f30317e = z ? 1 : 0;
                    abstractC14215e.f30319e = z;
                    view.f34242e = abstractC14215e;
                    view.f2262e = abstractC14215e;
                    view.startapp();
                    view.setVisibility(8);
                    view.setId(num.intValue());
                    int[] iArr2 = c13577e2.f26914switch;
                    if (iArr2 != null) {
                        view.setReferencedIds(iArr2);
                    } else {
                        String str4 = c13577e2.f26918throws;
                        if (str4 != null) {
                            int[] metrica2 = metrica(view, str4);
                            c13577e2.f26914switch = metrica2;
                            view.setReferencedIds(metrica2);
                        }
                    }
                    view.setType(c13577e2.f26915synchronized);
                    view.setMargin(c13577e2.f26910return);
                    C3579e ad = ConstraintLayout.ad();
                    view.startapp();
                    c0584e2.ad(ad);
                    constraintLayout.addView((View) view, ad);
                    i = z;
                } else {
                    i = i5;
                }
                if (c13577e2.ad) {
                    C10504e c10504e = new C10504e(constraintLayout.getContext());
                    c10504e.setId(num.intValue());
                    C3579e ad2 = ConstraintLayout.ad();
                    c0584e2.ad(ad2);
                    constraintLayout.addView(c10504e, ad2);
                }
                i5 = i;
            }
        }
        for (int i6 = i5; i6 < childCount; i6++) {
            View childAt2 = constraintLayout.getChildAt(i6);
            if (childAt2 instanceof AbstractC0268e) {
                ((AbstractC0268e) childAt2).appmetrica(constraintLayout);
            }
        }
    }

    public final void appmetrica(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    C0584e license2 = license(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        license2.license.ad = true;
                    }
                    this.metrica.put(Integer.valueOf(license2.ad), license2);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        }
    }

    public final void vip(ConstraintLayout constraintLayout) {
        int i;
        HashMap hashMap;
        int i2;
        C16732e c16732e = this;
        int childCount = constraintLayout.getChildCount();
        HashMap hashMap2 = c16732e.metrica;
        hashMap2.clear();
        int i3 = 0;
        while (i3 < childCount) {
            View childAt = constraintLayout.getChildAt(i3);
            C3579e c3579e = (C3579e) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c16732e.vip && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap2.containsKey(Integer.valueOf(id))) {
                hashMap2.put(Integer.valueOf(id), new C0584e());
            }
            C0584e c0584e = (C0584e) hashMap2.get(Integer.valueOf(id));
            if (c0584e == null) {
                i = childCount;
                hashMap = hashMap2;
                i2 = i3;
            } else {
                C9909e c9909e = c0584e.vip;
                C13577e c13577e = c0584e.license;
                C13277e c13277e = c0584e.appmetrica;
                i = childCount;
                HashMap hashMap3 = new HashMap();
                hashMap = hashMap2;
                Class<?> cls = childAt.getClass();
                i2 = i3;
                HashMap hashMap4 = c16732e.ad;
                for (String str : hashMap4.keySet()) {
                    C0377e c0377e = (C0377e) hashMap4.get(str);
                    HashMap hashMap5 = hashMap4;
                    try {
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new C0377e(c0377e, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            hashMap3.put(str, new C0377e(c0377e, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e) {
                        StringBuilder applovin = AbstractC8703e.applovin(" Custom Attribute \"", str, "\" not found on ");
                        applovin.append(cls.getName());
                        Log.e("TransitionLayout", applovin.toString(), e);
                    } catch (NoSuchMethodException e2) {
                        Log.e("TransitionLayout", cls.getName() + " must have a method " + str, e2);
                    } catch (InvocationTargetException e3) {
                        StringBuilder applovin2 = AbstractC8703e.applovin(" Custom Attribute \"", str, "\" not found on ");
                        applovin2.append(cls.getName());
                        Log.e("TransitionLayout", applovin2.toString(), e3);
                    }
                    hashMap4 = hashMap5;
                }
                c0584e.purchase = hashMap3;
                c0584e.ad = id;
                c13577e.yandex = c3579e.appmetrica;
                c13577e.startapp = c3579e.purchase;
                c13577e.adcel = c3579e.billing;
                c13577e.mopub = c3579e.yandex;
                c13577e.advert = c3579e.startapp;
                c13577e.smaato = c3579e.adcel;
                c13577e.amazon = c3579e.mopub;
                c13577e.loadAd = c3579e.advert;
                c13577e.Signature = c3579e.smaato;
                c13577e.admob = c3579e.amazon;
                c13577e.subscription = c3579e.loadAd;
                c13577e.remoteconfig = c3579e.remoteconfig;
                c13577e.pro = c3579e.pro;
                c13577e.signatures = c3579e.signatures;
                c13577e.tapsense = c3579e.tapsense;
                c13577e.isVip = c3579e.firebase;
                c13577e.inmobi = c3579e.f8071class;
                c13577e.isPro = c3579e.f8084interface;
                c13577e.applovin = c3579e.Signature;
                c13577e.ads = c3579e.admob;
                c13577e.premium = c3579e.subscription;
                c13577e.subs = c3579e.f8069case;
                c13577e.crashlytics = c3579e.f8070catch;
                c13577e.firebase = c3579e.f8077final;
                c13577e.purchase = c3579e.metrica;
                c13577e.license = c3579e.ad;
                c13577e.appmetrica = c3579e.vip;
                c13577e.vip = ((ViewGroup.MarginLayoutParams) c3579e).width;
                c13577e.metrica = ((ViewGroup.MarginLayoutParams) c3579e).height;
                c13577e.f26891class = ((ViewGroup.MarginLayoutParams) c3579e).leftMargin;
                c13577e.f26904interface = ((ViewGroup.MarginLayoutParams) c3579e).rightMargin;
                c13577e.f26900goto = ((ViewGroup.MarginLayoutParams) c3579e).topMargin;
                c13577e.f26916this = ((ViewGroup.MarginLayoutParams) c3579e).bottomMargin;
                c13577e.f26917throw = c3579e.crashlytics;
                c13577e.f26889case = c3579e.f8097this;
                c13577e.f26890catch = c3579e.f8080goto;
                c13577e.f26913super = c3579e.f8076extends;
                c13577e.f26897final = c3579e.f8085native;
                c13577e.f26892const = c3579e.f8094super;
                c13577e.f26921volatile = c3579e.f8086new;
                c13577e.f26906new = c3579e.f8098throw;
                c13577e.f26912strictfp = c3579e.f8103while;
                c13577e.f26908private = c3579e.f8068break;
                c13577e.f26907package = c3579e.f8067abstract;
                c13577e.f26919transient = c3579e.f8101try;
                c13577e.f26902import = c3579e.f8089protected;
                c13577e.f26903instanceof = c3579e.f8074default;
                c13577e.f26911static = c3579e.f8081implements;
                c13577e.f26898finally = c3579e.f8093strictfp;
                c13577e.f26920try = c3579e.inmobi;
                c13577e.f26888break = c3579e.applovin;
                c13577e.f26922while = c3579e.isVip;
                c13577e.f26909protected = c3579e.isPro;
                c13577e.f26894default = c3579e.ads;
                c13577e.f26887abstract = c3579e.premium;
                c13577e.f26901implements = c3579e.subs;
                c13577e.f26893continue = c3579e.f8088private;
                c13577e.f26905native = c3579e.getMarginEnd();
                c13577e.f26896extends = c3579e.getMarginStart();
                c9909e.ad = childAt.getVisibility();
                c9909e.metrica = childAt.getAlpha();
                c13277e.ad = childAt.getRotation();
                c13277e.vip = childAt.getRotationX();
                c13277e.metrica = childAt.getRotationY();
                c13277e.license = childAt.getScaleX();
                c13277e.appmetrica = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    c13277e.purchase = pivotX;
                    c13277e.billing = pivotY;
                }
                c13277e.startapp = childAt.getTranslationX();
                c13277e.adcel = childAt.getTranslationY();
                c13277e.mopub = childAt.getTranslationZ();
                if (c13277e.advert) {
                    c13277e.smaato = childAt.getElevation();
                }
                if (childAt instanceof C17479e) {
                    C17479e c17479e = (C17479e) childAt;
                    c13577e.f26899for = c17479e.getAllowsGoneWidget();
                    c13577e.f26914switch = c17479e.getReferencedIds();
                    c13577e.f26915synchronized = c17479e.getType();
                    c13577e.f26910return = c17479e.getMargin();
                }
            }
            i3 = i2 + 1;
            c16732e = this;
            childCount = i;
            hashMap2 = hashMap;
        }
    }
}
