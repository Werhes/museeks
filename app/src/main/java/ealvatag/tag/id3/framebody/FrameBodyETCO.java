package ealvatag.tag.id3.framebody;

import defpackage.AbstractC18186e;
import defpackage.C0215e;
import defpackage.C16151e;
import defpackage.C1724e;
import defpackage.C7936e;
import defpackage.EnumC1005e;
import defpackage.InterfaceC4279e;
import ealvatag.tag.datatype.DataTypes;
import ealvatag.tag.datatype.EventTimingCode;
import ealvatag.tag.datatype.EventTimingCodeList;
import ealvatag.tag.datatype.NumberHashMap;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* loaded from: classes3.dex */
public class FrameBodyETCO extends AbstractID3v2FrameBody implements ID3v24FrameBody, ID3v23FrameBody {
    private static final InterfaceC4279e LOG;
    public static final int MILLISECONDS = 2;
    public static final int MPEG_FRAMES = 1;

    static {
        int i = AbstractC18186e.ad;
        int i2 = C1724e.ad;
        LOG = new C7936e(2);
    }

    public FrameBodyETCO() {
        setObjectValue(DataTypes.OBJ_TIME_STAMP_FORMAT, 2);
    }

    public FrameBodyETCO(FrameBodyETCO frameBodyETCO) {
        super(frameBodyETCO);
    }

    public FrameBodyETCO(C16151e c16151e, int i) {
        super(c16151e, i);
    }

    public FrameBodyETCO(ByteBuffer byteBuffer, int i) {
        super(byteBuffer, i);
    }

    private void resolveRelativeTimestamps() {
        long j = 0;
        for (EventTimingCode eventTimingCode : (List) getObjectValue(DataTypes.OBJ_TIMED_EVENT_LIST)) {
            if (eventTimingCode.getTimestamp() != 0) {
                j = eventTimingCode.getTimestamp();
            }
            eventTimingCode.setTimestamp(j);
        }
    }

    private static Set<Integer> toSet(int... iArr) {
        HashSet hashSet = new HashSet();
        for (int i : iArr) {
            hashSet.add(Integer.valueOf(i));
        }
        return hashSet;
    }

    public void addTimingCode(long j, int... iArr) {
        int i;
        List<EventTimingCode> list = (List) getObjectValue(DataTypes.OBJ_TIMED_EVENT_LIST);
        if (list.isEmpty() || ((EventTimingCode) list.get(0)).getTimestamp() > j) {
            i = 0;
        } else {
            i = 0;
            long j2 = 0;
            for (EventTimingCode eventTimingCode : list) {
                if (eventTimingCode.getTimestamp() != 0) {
                    j2 = eventTimingCode.getTimestamp();
                }
                if (j < j2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        int i2 = i;
        for (int i3 : iArr) {
            list.add(i2, new EventTimingCode(DataTypes.OBJ_TIMED_EVENT, this, i3, j));
            i2++;
        }
    }

    public void clearTimingCodes() {
        ((List) getObjectValue(DataTypes.OBJ_TIMED_EVENT_LIST)).clear();
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody
    public String getIdentifier() {
        return "ETCO";
    }

    public int getTimestampFormat() {
        return ((Number) getObjectValue(DataTypes.OBJ_TIME_STAMP_FORMAT)).intValue();
    }

    public List<Long> getTimestamps(int... iArr) {
        Set<Integer> set = toSet(iArr);
        ArrayList arrayList = new ArrayList();
        long j = 0;
        for (EventTimingCode eventTimingCode : (List) getObjectValue(DataTypes.OBJ_TIMED_EVENT_LIST)) {
            if (eventTimingCode.getTimestamp() != 0) {
                j = eventTimingCode.getTimestamp();
            }
            if (set.contains(Integer.valueOf(eventTimingCode.getType()))) {
                arrayList.add(Long.valueOf(j));
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    public Map<Long, int[]> getTimingCodes() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j = 0;
        for (EventTimingCode eventTimingCode : (List) getObjectValue(DataTypes.OBJ_TIMED_EVENT_LIST)) {
            if (eventTimingCode.getTimestamp() != 0) {
                j = eventTimingCode.getTimestamp();
            }
            int[] iArr = (int[]) linkedHashMap.get(Long.valueOf(j));
            if (iArr == null) {
                linkedHashMap.put(Long.valueOf(j), new int[]{eventTimingCode.getType()});
            } else {
                int length = iArr.length;
                int[] iArr2 = new int[length + 1];
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                iArr2[length] = eventTimingCode.getType();
                linkedHashMap.put(Long.valueOf(j), iArr2);
            }
        }
        return DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    @Override // ealvatag.tag.id3.framebody.AbstractID3v2FrameBody, defpackage.AbstractC11463e
    public void read(ByteBuffer byteBuffer) {
        super.read(byteBuffer);
        long j = 0;
        for (EventTimingCode eventTimingCode : (List) getObjectValue(DataTypes.OBJ_TIMED_EVENT_LIST)) {
            long timestamp = eventTimingCode.getTimestamp() == 0 ? j : eventTimingCode.getTimestamp();
            if (eventTimingCode.getTimestamp() < j) {
                InterfaceC4279e interfaceC4279e = LOG;
                EnumC1005e[] enumC1005eArr = EnumC1005e.f3456e;
                eventTimingCode.getTimestamp();
                ((C7936e) interfaceC4279e).getClass();
                int i = C1724e.ad;
            }
            j = timestamp;
        }
    }

    public boolean removeTimingCode(long j, int... iArr) {
        resolveRelativeTimestamps();
        Set<Integer> set = toSet(iArr);
        ListIterator listIterator = ((List) getObjectValue(DataTypes.OBJ_TIMED_EVENT_LIST)).listIterator();
        boolean z = false;
        while (listIterator.hasNext()) {
            EventTimingCode eventTimingCode = (EventTimingCode) listIterator.next();
            if (j == eventTimingCode.getTimestamp() && set.contains(Integer.valueOf(eventTimingCode.getType()))) {
                listIterator.remove();
                z = true;
            }
            if (j > eventTimingCode.getTimestamp()) {
                break;
            }
        }
        return z;
    }

    public void setTimestampFormat(int i) {
        C0215e.ad().getValue(i);
        setObjectValue(DataTypes.OBJ_TIME_STAMP_FORMAT, Integer.valueOf(i));
    }

    @Override // defpackage.AbstractC12444e
    public void setupObjectList() {
        addDataType(new NumberHashMap(DataTypes.OBJ_TIME_STAMP_FORMAT, this, 1));
        addDataType(new EventTimingCodeList(this));
    }
}
